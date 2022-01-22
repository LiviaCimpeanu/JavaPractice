package Interfata;
//OP = programare orientata obiect
//Mostenirea, Incapsularea, Polimorfismul, Abstractizarea = concepte de OP
//Inheritance, Encapsulation, Polymorphism, and Data abstraction

import org.junit.Test;

public class InterfaceTest {
    @Test
    public void testAutomat(){
        PersoanaInginerInterface Florin=new PersoanaInginerInterface("Matei", "Florin");
        Florin.proiecteaza();
        Florin.executa();

        PersoanaITstInterface Alex=new PersoanaITstInterface("Dorha","Alex");
        Alex.scrieCod();
        Alex.ruleazaTeste();

        PersoanaInginerITstInterface Livia=new PersoanaInginerITstInterface("Cimpeanu", "Livia");
        Livia.proiecteaza();
        Livia.executa();
        Livia.scrieCod();
        Livia.ruleazaTeste();

    }

}
