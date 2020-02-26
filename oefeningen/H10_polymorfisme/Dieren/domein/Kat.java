package oefeningen.H10_polymorfisme.Dieren.domein;

public class Kat extends Dier {

    public Kat(int x) {
        super(x);
    }

    @Override
    public int berekenLeeftijdVolgensMens() {
        return super.berekenLeeftijd() * 7;
    }

    private void controleerGeboortejaar(int x){
        if(super.geefHuidigeJaar() - x < 27) {
            throw new IllegalArgumentException("fout geboortejaar");
        }
    }
}
