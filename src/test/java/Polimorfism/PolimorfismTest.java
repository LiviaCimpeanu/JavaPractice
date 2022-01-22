package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {
    @Test
    public void testAutomat(){
        Caine Daisy=new Caine("Labrador", "medie", "maro");
        Daisy.scoateSunet();
        Daisy.apeleazaMetodaParinte();
        Daisy.cumparaProduse();
        Daisy.cumparaProduse("lesa");
        Daisy.cumparaProduse(4);
    }
}
