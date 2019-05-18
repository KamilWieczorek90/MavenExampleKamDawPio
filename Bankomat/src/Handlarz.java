package egzamin1;

public class Handlarz extends Pracownik {

    Skutecznosc skutecznosc;
    int prowizja;

    public Handlarz(String imie, String nazwisko, int wiek, int doswiadczenie,
                    String ulica, int nrDomu, int nrLokalu, String miasto,
                    Skutecznosc skutecznosc, int prowizja) {
        super(imie, nazwisko, wiek, doswiadczenie, ulica, nrDomu, nrLokalu, miasto);
        this.skutecznosc = skutecznosc;
        this.prowizja = prowizja;
    }

    @Override
    public int wartoscDlaKorporacji() {
        return doswiadczenie * skutecznosc.getWartosc();
    }
}
