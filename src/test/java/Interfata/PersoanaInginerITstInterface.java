package Interfata;

public class PersoanaInginerITstInterface extends PersoanaInterface implements Inginer, ITst{
    public PersoanaInginerITstInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void scrieCod() {
        System.out.println("Inginerul ITst scrie cod");
    }

    @Override
    public void ruleazaTeste() {
        System.out.println("Inginerul ITst ruleaza teste");
    }

    @Override
    public void proiecteaza() {
        System.out.println("Inginerul ITst proiecteaza");
    }

    @Override
    public void executa() {
        System.out.println("Inginerul ITst executa");
    }
}
