// Kiraci sınıfı, bir konutun kiracısını temsil eder.
public class Kiraci {

    // Kiracıya ait özellikler
    private String ad;      // Kiracının adı
    private String soyad;   // Kiracının soyadı

    // Kiraci sınıfının yapıcı metodu, ad ve soyadı alarak kiracı nesnesini oluşturur
    public Kiraci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    // Kiracının adını döndüren metot
    public String getAd() {
        return ad;
    }

    // Kiracının soyadını döndüren metot
    public String getSoyad() {
        return soyad;
    }
}
