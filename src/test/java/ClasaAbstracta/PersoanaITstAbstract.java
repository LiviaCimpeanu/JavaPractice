package ClasaAbstracta;

public class PersoanaITstAbstract extends PersoanaAbstract{
    public String nume;
    public String prenume;

    public PersoanaITstAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void proiecteaza() {
    }

    @Override
    public void executa() {
    }

    @Override
    public void scrieCod() {
        System.out.println("ITst-ul scrie cod");
    }

    @Override
    public void ruleazaTeste() {
        System.out.println("ITst-ul ruleaza teste");
    }
}
