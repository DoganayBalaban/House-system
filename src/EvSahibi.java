public class EvSahibi {

    private String ad;
    private String soyad;
    private Bina bina;

    public EvSahibi(String ad, String soyad, Bina bina) {
        this.ad = ad;
        this.soyad = soyad;
        this.bina = bina;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public Bina getBina() {
        return bina;
    }

    public void displayInfo() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        if (bina != null) {
            System.out.println("Bina: " + bina.getAdres());
        }
    }

    public void addApartment(Daire daire) {
        bina.addDaire(daire);
    }
}
