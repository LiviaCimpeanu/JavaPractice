package Structuri;

import org.junit.Test;

public class StructuriRepetitive {

    //Cele mai intaltite structuri repetitive: for si while

    @Test
    public void test_automat(){
        //printam_numere_for();
        printam_numere_while();

    }

    //Printam primele 200 de numere

    public void printam_numere_for(){
        for (Integer i=1; i<=200; i++){
            System.out.println(i);
        }
    }

    public void printam_numere_while(){
        Integer i=1;
        while (i<=200){
            System.out.println(i);
            i++;
        }
    }
}
