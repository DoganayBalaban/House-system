import java.util.ArrayList;
import java.util.List;

// Bina sınıfı, bir konut binasını temsil eder ve içindeki daireleri, adresi, kat sayısını ve ev sahibini içerir.
public class Bina {

    // Bina özellikleri
    private String adres;
    private int katSayisi;
    private List<Daire> daireler;
    private EvSahibi evSahibi;

    // Bina sınıfının yapıcı metodu, adres ve kat sayısını alarak ayarlar
    public Bina(String adres, int katSayisi) {
        this.adres = adres;
        this.katSayisi = katSayisi;
        daireler = new ArrayList<>(); // Daireleri tutmak için ArrayList oluşturulur
    }

    // Daire eklemek için kullanılan metot
    public void addDaire(Daire daire) {
        daireler.add(daire);
    }

    // Bina bilgilerini ekrana yazdırmak için kullanılan metot
    public void displayInfo() {
        System.out.println("Adres: " + adres);
        System.out.println("Kat Sayısı: " + katSayisi);
        for (Daire daire : daireler) {
            daire.displayInfo(); // Her dairenin bilgilerini ekrana yazdır
        }
        if (evSahibi != null) {
            System.out.println("Ev Sahibi: " + evSahibi.getAd() + " " + evSahibi.getSoyad());
        }
    }

    // Adres bilgisini döndüren metot
    public String getAdres() {
        return adres;
    }
}
