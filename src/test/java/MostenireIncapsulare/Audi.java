package MostenireIncapsulare;

import java.util.List;

public class Audi extends Masina {

    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;


    public Audi(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari, Integer pret, String model) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);
        this.culoare=culoare;
        this.dotari=dotari;
        this.pret=pret;
        this.model=model;
    }

    public void infoMasina (){
        System.out.println("Detaliile despre masina Audi model "+model+" sunt: ");
        System.out.println(toString());
    }

    public void pretFinal(){
        Integer pretFinal=pret;
        Integer i=0;
        while (i< dotari.size()){
            if (dotari.get(i).equals("interior piele")){
                pretFinal=pretFinal+1200;
            }
            if (dotari.get(i).equals("volan incalzit")){
                pretFinal=pretFinal+500;
            }
            if (dotari.get(i).equals("incalzire scaun")){
                pretFinal=pretFinal+1000;
            }
            if (dotari.get(i).equals("AC")){
                pretFinal=pretFinal+1500;
            }
            i++;
        }
        System.out.println("Pretul final al masinii Audi model "+model+" este "+pretFinal);
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "culoare='" + getCuloare() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", model='" + getModel() + '\'' +
                ", tipCaroserie='" + getTipCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                '}';
    }
}
