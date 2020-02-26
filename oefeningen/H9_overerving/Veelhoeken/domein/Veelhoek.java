package oefeningen.H9_overerving.Veelhoeken.domein;

import java.util.IllformedLocaleException;

public class Veelhoek {
    private int aantalHoeken;
    private int aantal;

    public Veelhoek(int x){
        try {
            controleerAantalHoeken(x);
        } catch (IllformedLocaleException e) {
            e.printStackTrace();
        }
        this.aantalHoeken = x;
    }

    public int aantalHoeken(){
        return this.aantalHoeken;
    }

    public String toString(){
        System.out.println("Veelhoek" + "\n" + "Aantal hoeken = " + aantalHoeken + "\n");
        return "Veelhoek" + "\n" + "Aantal hoeken " + aantalHoeken;
    }

    public int getAantalHoeken() {
        return aantalHoeken;
    }

    private void controleerAantalHoeken(int x) throws IllformedLocaleException {
        if (x <= 2){
            throw new IllegalArgumentException("argument moet groter zijn dan 2");
        }
    }
}
