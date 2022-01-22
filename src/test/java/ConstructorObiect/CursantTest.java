package ConstructorObiect;

import org.junit.Test;

import java.util.Arrays;

public class CursantTest {
    @Test
    public void test_automat(){
        System.out.println("---Obiectul1---");
        Cursant Livia=new Cursant("Cimpeanu", "Livia", 26, 2.555, 'F', true, Arrays.asList("Manual", "Automation", "Java", "Database"));
        //Livia.date_cursant();
        Livia.prenume="Livia-Maria";
        Livia.date_cursant();
        Livia.verificare_dimploma();

        System.out.println("---Obiectul2---");
        Cursant Maricarmen=new Cursant("Manolache", "Maricarmen", 23, 2.555, 'F', false, Arrays.asList("Manual", "Automation", "DataBase"));
        Maricarmen.date_cursant();
        Maricarmen.verificare_dimploma();

        System.out.println("---Obiectul3---");
        Cursant MareleAlb=new Cursant("Marele", "Alb", 3000, 'M', true, Arrays.asList("Prohod", "Nunta"));
        MareleAlb.date_cursant();

        System.out.println("---Obiectul4---");
        Cursant Alex=new Cursant("Dolha", "Alex", 27, 2.555, 'M', true,"Automation");
        Alex.date_cursant();


    }

}
