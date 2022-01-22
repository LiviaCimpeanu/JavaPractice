package ConstructorObiect;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Cursant {

    //Obiect = instanta unei clasa
    //Recunoastem un obiect dupa cuvantul cheie new
    //Putem creea n obiecte intr-o clasa
    //Structura unui obiect: numeclasa numeobiect=new numeclasa (se va apela constructorul clasei)(dam valori pt variabile);
    //Exemplu obiect: Cursant Livia=new Cursant();
    //Constructor = are ca rol sa initializeze variabilel unei clase
    //Intr-o clasa putem avea n constructori
    //Exista 2 tipuri de constructori: cu parametri si fara parametri
    //Diferentierea intre constructori se face prin tipul parametrilor sau numarul parametrilor
    //Daca nu creem un constructor => exista unul by default fara parametri
    //Structura constructor: public numeclasa();
    //Boolean = accepta doar doua valori (true sau false)
    //sout *enter* scrie el automat System.out.println

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Character sex;
    public Boolean diploma_bac;
    public List<String> cursuri_interes;
    public String curs_interes;

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character sex, Boolean diploma_bac, List<String> cursuri_interes) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.sex = sex;
        this.diploma_bac = diploma_bac;
        this.cursuri_interes = cursuri_interes;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character sex, Boolean diploma_bac, String curs_interes) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.sex = sex;
        this.diploma_bac = diploma_bac;
        this.curs_interes = curs_interes;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character sex, Boolean diploma_bac, List<String> cursuri_interes) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.diploma_bac = diploma_bac;
        this.cursuri_interes = cursuri_interes;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character sex, Boolean diploma_bac, String curs_interes) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.diploma_bac = diploma_bac;
        this.curs_interes = curs_interes;
    }

    public void date_cursant(){
        System.out.println("Datele despre cursant sunt urmatoarele: ");
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(varsta);
        if(taxa!=null){
            System.out.println(taxa);
        }
        System.out.println(sex);
        System.out.println(diploma_bac);
        System.out.println("Cursurile de interes sunt: ");
        if(cursuri_interes!=null) {
            for (Integer i = 0; i < cursuri_interes.size(); i++) {
                System.out.println(cursuri_interes.get(i));
            }
        }
        else {
            System.out.println(curs_interes);
        }
    }

    public void verificare_dimploma(){
        if (diploma_bac){
            System.out.println("Cursantul "+nume+" "+prenume+" are diploma de BAC");
        }
        else{
            System.out.println("Cursantul "+nume+" "+prenume+" nu are diploma de BAC");
        }
    }


}
