package oefeningen.H10_polymorfisme.Dieren.domein;

public enum DierSoort {
    KAT(new String[]{"geboortejaar"}),
    HOND(new String[]{"naam", "geboortejaar"});

    private final String[] attribuutnamen;

    DierSoort(String[] attributen){
        this.attribuutnamen = attributen;
    }

    public String[] attribuutnamen(){
        return attribuutnamen;
    }
}
