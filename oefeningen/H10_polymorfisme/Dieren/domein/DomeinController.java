package oefeningen.H10_polymorfisme.Dieren.domein;

public class DomeinController {

    private DierRepository dierRepository;

    public DomeinController(){
        dierRepository = new DierRepository();
    }

    public void voegKatToe(int geboorteJaar){
        dierRepository.voegKatToe(geboorteJaar);
    }

    public void voegHondToe(String naam, int geboortejaar){
        dierRepository.voegHondToe(naam, geboortejaar);
    }

    public String maakOverzicht(){
        String output = null;
        for(Dier dier : dierRepository.dieren){
            output += dier.toString();
        }
        return output;
    }
}
