package Polimorfism;

public class Animal {
    //Polimorfism= conceptul prin care o metoda poate avea implementari diferite
    //Doua tipuri: dinamic (override) si static (overload)
    //Polimorfismul dinamic= intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfismul static= conceptul pe baza caruia o metoda are o structura diferita

    public String rasa;
    public String talie;
    public String culoareBlana;

    public Animal(String rasa, String talie, String culoareBlana) {
        this.rasa = rasa;
        this.talie = talie;
        this.culoareBlana = culoareBlana;
    }

    //polimorfism dinamic
    public void scoateSunet(){
        System.out.println("Animalul scoate sunet");
    }

    public Integer getPret(){
        return 3;
    }
}
