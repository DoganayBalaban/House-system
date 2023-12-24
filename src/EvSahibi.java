// EvSahibi sınıfı, bir konut binasının sahibini temsil eder.
public class EvSahibi {

    // EvSahibi özellikleri
    private String ad;       // EvSahibinin adı
    private String soyad;    // EvSahibinin soyadı
    private Bina bina;       // EvSahibinin sahip olduğu bina

    // EvSahibi sınıfının yapıcı metodu, ad, soyad ve sahip olduğu bina bilgilerini alarak EvSahibi nesnesini oluşturur
    public EvSahibi(String ad, String soyad, Bina bina) {
        this.ad = ad;
        this.soyad = soyad;
        this.bina = bina;
    }

    // EvSahibinin adını döndüren metot
    public String getAd() {
        return ad;
    }

    // EvSahibinin soyadını döndüren metot
    public String getSoyad() {
        return soyad;
    }

    // EvSahibinin sahip olduğu binayı döndüren metot
    public Bina getBina() {
        return bina;
    }

    // EvSahibinin bilgilerini ekrana yazdıran metot
    public void displayInfo() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        if (bina != null) {
            System.out.println("Bina: " + bina.getAdres());
        }
    }

    // EvSahibinin sahip olduğu binaya daire ekleyen metot
    public void addApartment(Daire daire) {
        bina.addDaire(daire);
    }
}
