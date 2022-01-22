package MostenireIncapsulare;

public class Masina {
    //Mostenire = conceptiul prin care o clasa mosteneste o alta clasa
    //Clasa care mosteneste = clasa copil
    //Clasa care este mostenita = clasa parinte
    //In momentul in care o clasa mosteneste o alta clasa => ai acces la toate variabilele/metodele daca acestea sunt publice
    //Se foloseste cuvantul cheie extends
    //In Java putem mosteni o singura clasa
    //private e un accces control - in momentul in care aplici private intr-o clasa variabila e vizibila doar in acea clasa
    //get da rezultatul dar nu te lasa sa il modifici
    //set te lasa sa iti da si te lasa sa si modifici

    private String tipCaroserie;
    private String transmisie;
    private String tractiune;
    private Integer usi;
    private Integer locuri;

    public Masina(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri) {
        this.tipCaroserie = tipCaroserie;
        this.transmisie = transmisie;
        this.tractiune = tractiune;
        this.usi = usi;
        this.locuri = locuri;
    }

    public String getTipCaroserie() {
        return tipCaroserie;
    }

    public void setTipCaroserie(String tipCaroserie) {
        this.tipCaroserie = tipCaroserie;
    }

    public String getTransmisie() {
        return transmisie;
    }

    public void setTransmisie(String transmisie) {
        this.transmisie = transmisie;
    }

    public String getTractiune() {
        return tractiune;
    }

    public void setTractiune(String tractiune) {
        this.tractiune = tractiune;
    }

    public Integer getUsi() {
        return usi;
    }

    public void setUsi(Integer usi) {
        this.usi = usi;
    }

    public Integer getLocuri() {
        return locuri;
    }

    public void setLocuri(Integer locuri) {
        this.locuri = locuri;
    }
}
