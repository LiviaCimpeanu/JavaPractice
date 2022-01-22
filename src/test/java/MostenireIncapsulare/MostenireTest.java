package MostenireIncapsulare;

import org.junit.Test;

import java.util.Arrays;

public class MostenireTest {

    @Test
    public void testAutomat(){
        Audi AudiA6=new Audi ("Hatchback","Automata","Integrala",4, 5, "negru",
                Arrays.asList("interior piele", "volan incalzit", "incalzire scaun", "AC"), 40000, "A6");
        AudiA6.infoMasina();
        AudiA6.pretFinal();
        Audi AudiI3=new Audi ("Limuzina","Manuala","4X4",4, 5, "gri sobolan",
                Arrays.asList("volan incalzit", "incalzire scaun", "AC"), 80000, "I3");
        AudiI3.infoMasina();
        AudiI3.getPret();
        AudiI3.setCuloare("Turcoaz");
        AudiI3.infoMasina();


        Toyota Auris=new Toyota("Break", "Hibrid", "Integrala", 2, 4, "Bordeau",
                Arrays.asList("interior piele", "incalzire scaun", "AC"), 55000, "Auris", "4.5l");
        Auris.infoMasina();
        Auris.pretFinal();
    }
}
