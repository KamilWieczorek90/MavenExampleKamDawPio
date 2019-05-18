package Kamil_Wieczorek;

public abstract class Pracownik {

    private   final int id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private int doswiadczenie;
    private Adres adres;

    private static int generatorId = 0;
//
//    public Pracownik(){
//        generatorId++;
//        id = generatorId;
//    }

    public Pracownik(String imie, String nazwisko, int wiek, int doswiadczenie, Adres adres) {
        this.
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.doswiadczenie = doswiadczenie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return
                "ID " + id +
                " " +imie +
                " " + nazwisko +
                ", " + wiek + " lat"+
                ", w zawodzie " + doswiadczenie + " lat" +
                ", pracuje na: " + adres;
    }
    public abstract int wartoscDlaKorporacji();


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getDoswiadczenie() {
        return doswiadczenie;
    }

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}



