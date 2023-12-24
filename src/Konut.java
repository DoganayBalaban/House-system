public abstract class Konut {

    protected String adres;

    public Konut(String adres) {
        this.adres = adres;
    }

    public abstract void displayInfo();
}
