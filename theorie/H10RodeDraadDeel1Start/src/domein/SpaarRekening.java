package domein;

import theorie.H10RodeDraadDeel1Start.src.domein.Rekening;

public class SpaarRekening extends Rekening {

    private static double aangroeiIntrest;

    public SpaarRekening(long rekeningNr, String houder) {
        super(rekeningNr, houder);
    }

    public static double getAangroeiIntrest() {
        return aangroeiIntrest;
    }

    public final static void setAangroeiIntrest(double aangroeiIntrest) {
        if (aangroeiIntrest < 0.0) 
            throw new IllegalArgumentException("Aangroeiintrest met >= 0 zijn");
        SpaarRekening.aangroeiIntrest = aangroeiIntrest;
    }

    
    @Override
    public boolean haalAf(double bedrag) {
        boolean succes = false;

        if (getSaldo() >= bedrag) {
            super.haalAf(bedrag);
            succes = true;
        }
        return succes;

    }

    @Override
    public String toString() {
        return String.format("%s. %s %.2f percent.",
                super.toString(),
                "Aangroeiintrest=", getAangroeiIntrest());

    }
}
