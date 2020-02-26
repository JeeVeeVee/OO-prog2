package oefeningen.H10_polymorfisme.Dieren;

import oefeningen.H10_polymorfisme.Dieren.domein.DomeinController;
import oefeningen.H10_polymorfisme.Dieren.ui.ConsoleApplicatie;

public class StartUp {
    public static void main(String[] args){
        DomeinController domeinController = new DomeinController();
        ConsoleApplicatie consoleApplicatie = new ConsoleApplicatie();
        consoleApplicatie.startApplicatie();

    }
}
