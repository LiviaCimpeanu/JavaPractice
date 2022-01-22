package Structuri;

import org.junit.Test;

public class StructuriAlternative {

    //Doua tipuri de structuri: alternative si repetitive
    //Structura alternativa = if conditie then
    //                                    else
    //Nu e obligatoriu ca if sa contina un else
    //Putem avea oricate if sunt necesare

    @Test
    public void test_automat(){
    verifica_numere();
    verifica_nume("Livia","Maria");
    verifica_nume("Livia","Livi");
    verifica_numere_complex(45,89);
    verifica_numere_complex(55,55);
    verifica_numere_complex(129,12);

    }

    //Verificam daca 5>3

    public void verifica_numere(){
        if (5<3){
            System.out.println("5 e mai mare decat 3");
        }
        else{
            System.out.println("5 nu este mai mare decat 3");
        }
    }

    //Verificam daca Alexandru contine Alex
    public void verifica_nume(String nume1, String nume2){
        if (nume1.contains(nume2)){
            System.out.println(nume1+" contine "+nume2);
        }
        else{
            System.out.println(nume1+" nu contine "+nume2);
        }
    }

    //Verificam daca un numar e mai mare decat altul cu mai multe cazuri
    public void verifica_numere_complex(Integer nr1,Integer nr2){
        if (nr1>nr2){
            System.out.println(nr1+" este mai mare decat "+nr2);
        }
        if (nr1<nr2){
            System.out.println(nr1+" este mai mic decat "+nr2);
        }
        if (nr1==nr2){
            System.out.println(nr1+" este mai egal cu "+nr2);
        }
        if (nr1!=nr2){
            System.out.println(nr1+" este diferit de "+nr2);
        }
    }


}
