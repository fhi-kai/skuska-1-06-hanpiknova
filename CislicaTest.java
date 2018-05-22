package sk.euba.fhi.tajj.cislica;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CislicaTest {

    private Cislica cislica;
    @Before
    public void setup() {
        this.cislica = new SpolocnaCislica();
    }
    @Test
    public void testDveTri() {
        assertEquals( true,  this.cislica.spolocnaCislica( 12,23 ) );
        assertEquals( false,  this.cislica.spolocnaCislica( 12,43 ) );
        assertEquals( false,  this.cislica.spolocnaCislica( 12,44 ) );
        assertEquals( true,  this.cislica.spolocnaCislica( 15,25 ) );
    }
}
