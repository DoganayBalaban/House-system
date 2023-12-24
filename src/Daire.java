// Daire sınıfı, Konut sınıfından türetilmiş ve Comparable arayüzünü implemente etmiştir.
public class Daire extends Konut implements Comparable<Daire> {

    // Daireye ait özellikler
    private int daireNumarasi;
    private Kiraci kiraci;

    // Daire sınıfının yapıcı metodu
    public Daire(String adres, int daireNumarasi, Kiraci kiraci) {
        super(adres);
        this.daireNumarasi = daireNumarasi;
        this.kiraci = kiraci;
    }

    // Daire numarasını döndüren metot
    public int getDaireNumarasi() {
        return daireNumarasi;
    }

    // Adresi döndüren metot (üst sınıftan alınan)
    public String getAdres() {
        return adres;
    }

    // Bilgileri ekrana yazdırmak için override edilmiş metot
    @Override
    public void displayInfo() {
        System.out.println("Adres: " + getAdres());
        System.out.println("Daire Numarası: " + getDaireNumarasi());
        if (kiraci != null) {
            System.out.println("Kiracı: " + kiraci.getAd() + " " + kiraci.getSoyad());
        }
    }

    // Comparable arayüzünden implemente edilen metot
    @Override
    public int compareTo(Daire daire) {
        // Daire numaralarını karşılaştırarak sıralama yapabilirsiniz
        return Integer.compare(this.daireNumarasi, daire.daireNumarasi);
    }
}
