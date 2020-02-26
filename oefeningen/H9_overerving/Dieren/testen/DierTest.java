package testen;

import java.time.Year;

import oefeningen.H9_overerving.Dieren.domein.Dier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DierTest {

    private Dier d1, d2;
    private int huidigJaar = Year.now().getValue();
    
    private static final int GEBOORTEJAAR_D1 = 2000;
    private int ouderdomInJaarD1;
    
    
    @BeforeEach
    public void before() {
        d1 = new Dier(2000);
        d2 = new Dier(huidigJaar);
        
        ouderdomInJaarD1 = huidigJaar - GEBOORTEJAAR_D1;
    }

    @Test
    public void maakDier_geboortejaar_maaktObject() {
        Assertions.assertEquals(2000, d1.getGeboortejaar());
    }

    @Test
    public void maakDier_geboortejaarHuidigJaar_maaktObject() {
        Assertions.assertEquals(huidigJaar, d2.getGeboortejaar());
    }

    @Test
    public void maakDier_geboortejaarInToekomst_werptException() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Dier(2070));
    }

    @Test
    public void berekenLeeftijdVolgensMens_retourneertLeeftijdVolgensMens() {
        Assertions.assertEquals(0, d1.berekenLeeftijdVolgensMens());
    }

    @Test
    public void berekenLeeftijdDier_retourneertLeeftijd() {
        Assertions.assertEquals(ouderdomInJaarD1, d1.berekenLeeftijd());
    }

    @Test
    public void toString_retourneertTekstueleWeergave() {
    	String check = String.format("DIER: leeftijd is %d en volgens de mens 0", ouderdomInJaarD1);
        Assertions.assertEquals(check, d1.toString());
    }

}
