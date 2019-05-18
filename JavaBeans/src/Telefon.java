public class Telefon {
    private  String model;
    private Wyswietlacz wyswietlacz;
    private int cena;
    private Aparat aparat;

    public Telefon(String model, Wyswietlacz wyswietlacz, int cena, Aparat aparat){
        this.model = model;
        this.wyswietlacz = wyswietlacz;
        this.cena = cena;
        this.aparat = aparat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wyswietlacz getWyswietlacz() {
        return wyswietlacz;
    }

    public void setWyswietlacz(Wyswietlacz wyswietlacz) {
        this.wyswietlacz = wyswietlacz;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Aparat getAparat() {
        return aparat;
    }

    public void setAparat(Aparat aparat) {
        this.aparat = aparat;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "model='" + model + '\'' +
                ", wyswietlacz=" + wyswietlacz +
                ", cena=" + cena +
                ", aparat=" + aparat +
                '}';
    }
}
