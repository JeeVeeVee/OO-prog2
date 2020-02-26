package oefeningen.H10_polymorfisme.Dieren.domein;

import oefeningen.H10_polymorfisme.Dieren.persistentie.Dierenmapper;

import java.util.ArrayList;

public class DierRepository {
    public ArrayList<Dier> dieren;
    private Dierenmapper dierenmapper;

    public DierRepository(){
        dierenmapper = new Dierenmapper();
        dieren = (ArrayList<Dier>) dierenmapper.geefDieren();
    }

    public void voegKatToe(int geboortejaar){
        Kat kat = new Kat(geboortejaar);
        dieren.add(kat);
    }

    public void voegHondToe(String naam, int geboortejaar){
        Hond hond = new Hond(geboortejaar, naam);
        dieren.add(hond);
    }

}
