package oose.ooad.odinido;

public class App {

    public static  void main(String [] args){
        TestData testData = new TestData();
        Lokaal lokaal = new Lokaal("123", testData.getUitvoering());
        LokaalController lokaalController = new LokaalController(lokaal);
        lokaalController.uitvoerenKennistoets("123", "Klaas");
    }
}
