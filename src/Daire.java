public class Daire extends Konut implements Comparable<Daire> {

    private int daireNumarasi;
    private Kiraci kiraci;

    public Daire(String adres, int daireNumarasi, Kiraci kiraci) {
        super(adres);
        this.daireNumarasi = daireNumarasi;
        this.kiraci = kiraci;
    }

    public int getDaireNumarasi() {
        return daireNumarasi;
    }

    public String getAdres() {
        return adres;
    }

    @Override
    public void displayInfo() {
        System.out.println("Adres: " + getAdres());
        System.out.println("Daire Numarası: " + getDaireNumarasi());
        if (kiraci != null) {
            System.out.println("Kiracı: " + kiraci.getAd() + " " + kiraci.getSoyad());
        }
    }

    @Override
    public int compareTo(Daire daire) {
        // Daire numaralarını karşılaştırarak sıralama yapabilirsiniz
        return Integer.compare(this.daireNumarasi, daire.daireNumarasi);
    }
}
