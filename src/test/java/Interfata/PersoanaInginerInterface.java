package Interfata;

public class PersoanaInginerInterface extends PersoanaInterface implements Inginer{
    public PersoanaInginerInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void proiecteaza() {
        System.out.println("Inginerul proiecteaza");
    }

    @Override
    public void executa() {
        System.out.println("Inginerul executa");
    }
}
