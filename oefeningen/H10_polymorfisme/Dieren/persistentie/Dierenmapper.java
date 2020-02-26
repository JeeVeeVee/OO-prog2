package oefeningen.H10_polymorfisme.Dieren.persistentie;

import oefeningen.H10_polymorfisme.Dieren.domein.Dier;
import oefeningen.H10_polymorfisme.Dieren.domein.Hond;
import oefeningen.H10_polymorfisme.Dieren.domein.Kat;

import java.util.ArrayList;
import java.util.List;

public class Dierenmapper {

    public List<Dier> geefDieren(){
        List<Dier> dier = new ArrayList<>();
        dier.add(new Kat(2000));
        dier.add(new Hond(2998, "Fluffy"));
        dier.add(new Kat(2003));
        dier.add(new Hond(2005, "Lady"));
        return dier;
    }
}
