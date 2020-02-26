package oefeningen.H9_overerving.Dieren.domein;

public class Hond extends Dier {

    private String naam;

    public Hond(int x, String s){
        super(x);
        controleerNaam(s);
        this.naam = s;
    }

    public Hond(int x) {
        super(x);
        this.naam = "onbekend";
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public int berekenLeeftijdVolgensMens() {
        int output = 0;
        for(int i = 0; i < super.berekenLeeftijd(); i++){
            output += generateTabel()[i];
        }
        return output;
    }

    private void controleerNaam(String s){
        if(s.isEmpty()){
            throw new IllegalArgumentException("naam moet ingevuld zijn");
        }
    }

    private void controleerGeboortejaar(int x){
        if(super.geefHuidigeJaar() - x < 29) {
            throw new IllegalArgumentException("fout geboortejaar");
        }
    }

    private int[] generateTabel(){
        int[] output = new int[29];
        int teller = 10;
        for(int i = 0; i < 29; i++){
            if (teller == 5){
                output[i] = teller;
            } else{
                output[i] = teller;
                teller--;
            }
        }
        return output;
    }
}
