package domein;

import java.math.BigDecimal;

public class Hond extends Huisdier {
    public Hond(){
        this("Geen naam");       
    }
    
    public Hond(String naam) {
        super(naam);     
    }

    @Override
    public String maakGeluid(){
    	return "Woef, woef...";
    }
    
    @Override
    public void draw() {
        System.out.printf("Tekening van Hond.%n");
    }
    
    @Override
    public BigDecimal cost() {      
        System.out.printf("Een Hond is onbetaalbaar.%n");
        return BigDecimal.valueOf(1000000);
    }
}
