package oose.ooad.odinido;

public class App {

    public static  void main(String [] args){
        TestData testData = new TestData();
        UitvoeringKennistoets uitvoeringKennistoets = new UitvoeringKennistoets(testData.getKennistoets(), testData.getLokaal());
        uitvoeringKennistoets.uitvoerenKennistoets("123AB", "Piet");
    }
}
