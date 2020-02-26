package oefeningen.H10_polymorfisme.Veelhoeken.testen;

import oefeningen.H10_polymorfisme.Veelhoeken.domein.Veelhoek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VeelhoekTest
{

    private Veelhoek v1;

    @BeforeEach
    public void before()
    {
        v1 = new Veelhoek(4);
    }

    @Test
    public void maakVeelhoek_4Hoeken_maaktObject()
    {

        Assertions.assertEquals(4, v1.getAantalHoeken());

    }

    @Test
    public void maakVeelhoek_2Hoeken_maaktObject()
    {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> new Veelhoek(2));
    }

    @Test
    public void toString_toonTekstueleWeergave()
    {

        Assertions.assertEquals(String.format("Veelhoek%nAantal hoeken = 4%n"), v1.toString());
    }
}
