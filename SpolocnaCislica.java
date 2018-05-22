package sk.euba.fhi.tajj.cislica;

public class SpolocnaCislica implements Cislica {
       @Override
    public boolean spolocnaCislica(int prve, int druhe) {
        int aL = prve / 10;

        int aR = prve % 10;
        int bL = druhe / 10;
        int bR = druhe % 10;
        if (aL == bL || aL == bR || aR == bL || aR == bR)
        return true;
else
        return false;
    };
    }
