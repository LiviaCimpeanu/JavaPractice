package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @Test
    public void test_automat(){
        //multimi_numere_Array();
        //multimi_prenume_Array();
        //multimi_prenume_Liste();
        //multimi_valori_HashMap();
        multimi_tari_orase();
    }

    public void multimi_numere_Array(){
        Integer[] numere=new Integer[3];
        numere[0]=5;
        numere[1]=6;
        numere[2]=7;
        for (Integer i=0; i<numere.length; i++){
            System.out.println(numere[i]);
        }
    }

    public void multimi_prenume_Array(){
        String[] prenume=new String[4];
        prenume[0]="Livia";
        prenume[1]="Adela";
        prenume[2]="Alex";
        prenume[3]="Florin";
        for (Integer i=0;i<prenume.length;i++){
            System.out.println(prenume[i]);
        }
    }
    public void multimi_prenume_Liste(){
        List<String> prenume=new ArrayList<>();
        prenume.add("Livia");
        prenume.add("Adela");
        prenume.add("Alex");
        prenume.add("Florin");
        prenume.add("Daniela");
        for (Integer i=0;i<prenume.size();i++){
            System.out.println(prenume.get(i));
        }
    }

    public void multimi_valori_HashMap(){
        //HashMap functioneaza dupa logica de key=value
        HashMap<String,String> obiecte_diferite=new HashMap<>();
        obiecte_diferite.put("Fruct","Mar");
        obiecte_diferite.put("Leguma","Morcov");
        obiecte_diferite.put("Haina","Bluza");
        for (String key:obiecte_diferite.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+obiecte_diferite.get(key));
        }
        Object firstKey = obiecte_diferite.keySet().toArray()[0];
        Object valueForFirstKey = obiecte_diferite.get(firstKey);
        System.out.println("Prima cheie este "+firstKey.toString());
        System.out.println("Prima valoare este "+valueForFirstKey.toString());
    }

    public void multimi_tari_orase(){
        List<String> orase_Romania=new ArrayList<>();
        orase_Romania.add("Cluj-Napoca");
        orase_Romania.add("Piatra Neamt");
        orase_Romania.add("Iasi");
        orase_Romania.add("Bucuresti");

        List<String> orase_Spania=new ArrayList<>();
        orase_Spania.add("Barcelona");
        orase_Spania.add("Valencia");
        orase_Spania.add("Madrid");

        HashMap<String,List<String>> tari=new HashMap<>();
        tari.put("Romania",orase_Romania);
        tari.put("Spania",orase_Spania);

        for (String key:tari.keySet()){
            System.out.println("Tara este "+key);
            System.out.println("Orasele sunt "+tari.get(key));
        }
    }
}
//cu [] declaram multimi Array - Integer[] multime Array de numere intregi
//intr-un array prima pozitie este 0
//nume multume.lenght returneaza el singur dimensiunea multimii
//O alta metoda de a interactiona cu o multime (pe langa Array) sunt Listele
//echivalentul pt lenght intr-o lista este size
//.get() iti da valoarea de la o anumita pozitie dintr-o lista
//.put() iti da valiarea de la o anumita cheie definita dintr-un hashmap