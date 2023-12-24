import java.util.ArrayList;
import java.util.List;

public class Bina {

    private String adres;
    private int katSayisi;
    private List<Daire> daireler;
    private EvSahibi evSahibi;

    public Bina(String adres, int katSayisi) {
        this.adres = adres;
        this.katSayisi = katSayisi;
        daireler = new ArrayList<>();
    }

    public void addDaire(Daire daire) {
        daireler.add(daire);
    }

    public void displayInfo() {
        System.out.println("Adres: " + adres);
        System.out.println("Kat Sayısı: " + katSayisi);
        for (Daire daire : daireler) {
            daire.displayInfo();
        }
        if (evSahibi != null) {
            System.out.println("Ev Sahibi: " + evSahibi.getAd() + " " + evSahibi.getSoyad());
        }
    }

    public String getAdres() {
        return adres;
    }
}