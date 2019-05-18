package egzamin1;

public abstract class Pracownik {

    private static int generatorId = 0;

    final int id;
    String imie;
    String nazwisko;
    int wiek;
    int doswiadczenie;
    Adres adres;

    public Pracownik(String imie,
                     String nazwisko,
                     int wiek,
                     int doswiadczenie,
                     String ulica, int nrDomu, int nrLokalu, String miasto) {
        this.id = ++generatorId;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.doswiadczenie = doswiadczenie;
        this.adres = new Adres(ulica, nrDomu, nrLokalu, miasto);
    }

    public abstract int wartoscDlaKorporacji();

    @Override
    public String toString() {
        return id + " " +  imie + " " + nazwisko + " " + doswiadczenie + " " + wiek + " " + adres.miasto;
    }
}
