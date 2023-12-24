// Konut sınıfı, soyut (abstract) bir sınıftır ve ev, daire gibi konut türlerini temsil etmek üzere tasarlanmıştır.
public abstract class Konut {

    // Konuta ait adres bilgisini saklayan korumalı bir özellik
    protected String adres;

    // Konut sınıfının yapıcı metodu, konutun adresini alarak ayarlar
    public Konut(String adres) {
        this.adres = adres;
    }

    // Alt sınıflar tarafından implemente edilecek olan soyut metot
    // Bu metot, konutun bilgilerini ekrana yazdırmak için kullanılacaktır.
    public abstract void displayInfo();
}
