package oefeningen.H10_polymorfisme.Dieren.domein;

import java.time.Year;

public abstract class Dier {

    private final int geboortejaar;

    public Dier(int x){
        this.geboortejaar = x;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public int berekenLeeftijd(){
        return geefHuidigeJaar() - this.geboortejaar;
    }

    public int berekenLeeftijdVolgensMens(){
        return 0;
    }

    protected int geefHuidigeJaar(){
        return Year.now().getValue();
    }

    private void controleerGeboorteJaar(int x){
        if( x > geefHuidigeJaar()){
            throw new IllegalArgumentException("foute input voor geboortejaar");
        }
    }




}
