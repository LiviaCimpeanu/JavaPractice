package ClasaAbstracta;

import org.junit.Test;

public class AbstractTest {
    @Test
    public void testAutomat(){
        PersoanaInginerAbstract Florin=new PersoanaInginerAbstract("Matei", "Florin");
        Florin.proiecteaza();
        Florin.executa();
        Florin.afisareVarsta(28);

        PersoanaITstAbstract Alex=new PersoanaITstAbstract("Dorha", "Alex");
        Alex.scrieCod();
        Alex.ruleazaTeste();
        Alex.afisareVarsta(27);

        PersoanaInginerITstAbstract Livia=new PersoanaInginerITstAbstract("Cimpeanu", "Livia");
        Livia.proiecteaza();
        Livia.executa();
        Livia.scrieCod();
        Livia.ruleazaTeste();
        Livia.afisareVarsta(26);
    }
}
