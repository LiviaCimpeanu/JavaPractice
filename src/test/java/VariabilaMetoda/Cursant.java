package VariabilaMetoda;

import org.junit.Test;

public class Cursant {

    //am facut un comentariu
    //Clasa=Un sablon de variabile si metode
    //Variabila=Atributul unei clase
    //Metoda=Actiunea unei clase
    //Tot timpul o clasa va avea langa nume cuvantul "class"
    //O clasa trebuie sa aiba un nume
    //O clasa trebuie sa fie publica pentru moment=>inseamna ca oricine poate sa vada clasa respectiva
    //O variabila poate sa fie de 2: tipuri Variabila globala sau locala
    //Variabila  globala este vizibila peste tot in clasa noastra
    //variabila globala structura=public tipVariabila numeVariabila;
    //Variabila locala este vizibila doar in locul unde am scris
    //Variabila locala structura = tipVariabila numeVariabila;
    //O variabila poate sau nu sa primeasca o valoare
    //Ca sa dam o valoare variabilei folosim "="
    //String = sir de caractere
    //Orice tasta este un caracter la tastatura
    //Integer = numar intreg
    //Double este un numar cu zecimala
    //Zecimala se separa cu "."
    //Metodele sunt de 2 feluri: void & return
    //Metoda void structura = public Void (tipMetoda) numeMetoda(){}
    //Metoda return structura = public tipVariabila NumeMetoda(){} *adaug un get la nume ca sa se diferentieze faptul ca este un return*

    public String nume;
    public String prenume;
    public String adresa;
    public Integer adresa_numar;
    public Double kg;
    public Integer varsta;
    public Double experienta;

    @Test
    public void test_automat(){

    inscriere_curs();
    plateste_taxa();
    calculeaza_suma();
    System.out.println(getsalar()+" RON");
    System.out.println(getadresa());
    }

    @Test
    public void inscriere_curs(){
        nume="Cimpeanu";
        prenume="Livia";
        adresa="Strada Mihai Romanu";
        adresa_numar=25;
        varsta=26;
        kg=64.2;
        experienta=2.1;

        //afisam o valoare in consola
        System.out.print(nume+" ");
        System.out.println(prenume);
        System.out.println(adresa+" "+adresa_numar);
        System.out.println(varsta);
        System.out.println(kg);
        System.out.println(experienta);

        //print = printeaza si ramane cu cursorul pe linia curenta
        //println = printeaza si dupa trece cursorul pe linia urmatoare

    }

    @Test
    public void plateste_taxa(){
        nume="Cimpeanu";
        prenume="Livia";
        //declaram si initializam o variabila locala
        Integer taxa=2550;
        System.out.println("Cursantul cu numele "+nume+" si prenumele "+prenume+" a platit taxa de "+taxa+" RON");
    }

    public void calculeaza_suma (){
    //declaram 3 variabile care adunate sa fie 100
        Integer suma=0;
        Integer v1=30;
        Integer v2=30;
        Integer v3=40;
        suma=v1+v2+v3;
        System.out.println("Suma celor 3 variabile este "+suma);
    }

    public Double getsalar (){

       Double salar=123.456;
       return salar;
    }

    public String getadresa (){
        String adresa="Alexandru Lapusneanu 71";
        return adresa;
    }

}
