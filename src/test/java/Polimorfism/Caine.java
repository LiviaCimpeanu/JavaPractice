package Polimorfism;

public class Caine extends Animal {
    public Caine(String rasa, String talie, String culoareBlana) {
        super(rasa, talie, culoareBlana);
    }

    //Polimorfismul dinamic
    @Override
    public void scoateSunet() {
        System.out.println("Cainele latra");
    }

    public void apeleazaMetodaParinte() {
        super.scoateSunet();
    }

    //Polimorfismul static
    public void cumparaProduse(){
        System.out.println("Nu am cumparat niciun produs");
    }

    public void cumparaProduse(String produs1){
        System.out.println("Am cumparat un produs: "+produs1);
    }

    public void cumparaProduse(Integer produs1){
        System.out.println("Am cumparat un produs: "+produs1);
    }

    public Integer getCaine(){
        return 1;
    }

    public String getCaine(String numar){
        return "1";
    }

    @Override
    public Integer getPret(){
        return 5;
    }
    //polimorfismul static se poate aplica la medode cu return doar la numarul parametrilor
    //metoda return se poate aplica la polimorfismul dinamic
}
