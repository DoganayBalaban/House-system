public class Main {

    public static void main(String[] args) {
        // İstanbul, Kadıköy'de bulunan bir binayı temsil eden nesne oluşturuluyor.
        Bina bina = new Bina("İstanbul, Kadıköy", 3);
        // Ev sahibini temsil eden nesne oluşturuluyor ve bu nesneye bir ad ve soyad atanıyor.
        EvSahibi evSahibi = new EvSahibi("Doğanay", "Balaban", bina);

        // Kiracıları temsil eden nesneler oluşturuluyor ve her birine ad ve soyad atanıyor.
        Kiraci kiraci1 = new Kiraci("Ali", "Veli");
        Kiraci kiraci2 = new Kiraci("Ayşe", "Fatma");
        Kiraci kiraci3 = new Kiraci("Mehmet", "Yılmaz");

        // Daireleri temsil eden nesneler oluşturuluyor ve her birine daire numarası ve kiracı atanıyor.
        Daire daire1 = new Daire(bina.getAdres(), 101, kiraci1);
        Daire daire2 = new Daire(bina.getAdres(), 102, kiraci2);
        Daire daire3 = new Daire(bina.getAdres(), 103, kiraci3);

        // Bina nesnesine daireler ekleniyor.
        bina.addDaire(daire1);
        bina.addDaire(daire2);
        bina.addDaire(daire3);

        // Ev sahibi nesnesine daireler ekleniyor.
        evSahibi.addApartment(daire1);
        evSahibi.addApartment(daire2);
        evSahibi.addApartment(daire3);

        // Bina bilgileri ekrana yazdırılıyor.
        bina.displayInfo();
    }
}