package Interfata;

public class PersoanaITstInterface extends PersoanaInterface implements ITst{
    public PersoanaITstInterface(String nume, String prenume) {
        super(nume, prenume);
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
