package egzamin1;

public class PracownikFizyczny extends Pracownik {

    int sila;

    public PracownikFizyczny(String imie, String nazwisko, int wiek, int doswiadczenie,
                             String ulica, int nrDomu, int nrLokalu, String miasto, int sila) {
        super(imie, nazwisko, wiek, doswiadczenie, ulica, nrDomu, nrLokalu, miasto);
        this.sila = sila;
    }

    @Override
    public int wartoscDlaKorporacji() {
        return doswiadczenie * sila / wiek;
    }
}
