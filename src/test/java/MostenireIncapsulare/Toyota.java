package MostenireIncapsulare;

import java.util.List;

public class Toyota extends Masina {

    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;
    private String motorizare;

    public Toyota(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari, Integer pret, String model, String motorizare) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);
        this.culoare=culoare;
        this.dotari=dotari;
        this.pret=pret;
        this.model=model;
        this.motorizare=motorizare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(String motorizare) {
        this.motorizare = motorizare;
    }

    public void infoMasina (){
        System.out.println("Detaliile despre masina Toyota model "+model+" sunt: ");
        System.out.println(toString());
    }

    public void pretFinal(){
        Integer pretFinal=pret;
        Integer i=0;
        while (i< dotari.size()){
            if (dotari.get(i).equals("interior piele")){
                pretFinal=pretFinal+1000;
            }
            if (dotari.get(i).equals("volan incalzit")){
                pretFinal=pretFinal+700;
            }
            if (dotari.get(i).equals("incalzire scaun")){
                pretFinal=pretFinal+900;
            }
            if (dotari.get(i).equals("AC")){
                pretFinal=pretFinal+1600;
            }
            i++;
        }
        System.out.println("Pretul final al masinii Toyota model "+model+" este "+pretFinal);
    }


    @Override
    public String toString() {
        return "Toyota{" +
                "tipCaroserie='" + getTipCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                ", culoare='" + getCuloare() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", model='" + getModel() + '\'' +
                ", motorizare='" + getMotorizare() + '\'' +
                '}';
    }
}
