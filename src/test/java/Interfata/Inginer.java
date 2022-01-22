package Interfata;

public interface Inginer {
    //Abstractizare = conceptul prin care definim comportamentul unei clase
    //Toate metodele dintr-o interfata sunt abstracte (nu au implementare)
    //Interfata nu are constructor =>  nu poti face un obiect
    //Interfata se implementeaza
    //Clasa care implementeaza interfata = implementeaza toate metodele interfetei
    //O clasa poate implementa mai multe interfete
    //O interfata poate mosteni o alta interfata
    //<etodele din interfata sunt intotdeauna publice (nu mai e nevoie sa scriem public)

    void proiecteaza();
    void executa();

}
