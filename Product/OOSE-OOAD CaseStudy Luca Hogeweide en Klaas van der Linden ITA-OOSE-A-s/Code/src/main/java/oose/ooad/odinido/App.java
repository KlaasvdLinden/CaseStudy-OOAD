package oose.ooad.odinido;

import java.util.Scanner;

public class App {

    public static  void main(String [] args){
        TestData testData = new TestData();
        Lokaal lokaal = new Lokaal("123", testData.getUitvoering());
        LokaalController lokaalController = new LokaalController(lokaal);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ een lokaalcode in: ");
        String lokaalCode = scanner.nextLine();
        System.out.println("Typ een gebruikersnaam in: ");
        String gebruikersnaam = scanner.nextLine();
        lokaalController.uitvoerenKennistoets(lokaalCode, gebruikersnaam);
    }
}
