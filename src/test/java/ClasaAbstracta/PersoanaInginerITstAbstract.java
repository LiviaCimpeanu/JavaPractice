package ClasaAbstracta;

public class PersoanaInginerITstAbstract extends PersoanaAbstract{
    public String nume;
    public String prenume;

    public PersoanaInginerITstAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void proiecteaza() {
        System.out.println("Inginerul ITst proiecteaza");
    }

    @Override
    public void executa() {
        System.out.println("Inginerul ITst executa");
    }

    @Override
    public void scrieCod() {
        System.out.println("Inginerul ITst scrie cod");
    }

    @Override
    public void ruleazaTeste() {
        System.out.println("Inginerul ITst ruleaza teste");
    }
}
