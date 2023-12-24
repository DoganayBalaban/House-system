public class Main {

    public static void main(String[] args) {
        Bina bina = new Bina("İstanbul, Kadıköy", 3);
        EvSahibi evSahibi = new EvSahibi("Doğanay", "Balaban", bina);

        Kiraci kiraci1 = new Kiraci("Ali", "Veli");
        Kiraci kiraci2 = new Kiraci("Ayşe", "Fatma");
        Kiraci kiraci3 = new Kiraci("Mehmet", "Yılmaz");

        Daire daire1 = new Daire(bina.getAdres(), 101, kiraci1);
        Daire daire2 = new Daire(bina.getAdres(), 102, kiraci2);
        Daire daire3 = new Daire(bina.getAdres(), 103, kiraci3);

        bina.addDaire(daire1);
        bina.addDaire(daire2);
        bina.addDaire(daire3);

        evSahibi.addApartment(daire1);
        evSahibi.addApartment(daire2);
        evSahibi.addApartment(daire3);

        bina.displayInfo();
    }
}