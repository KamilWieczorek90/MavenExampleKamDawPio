package egzamin1;

public class PracownikBiurowy extends Pracownik {

    int idBiurka;
    int intelekt;

    public PracownikBiurowy(String imie,
                            String nazwisko,
                            int wiek,
                            int doswiadczenie,
                            String ulica, int nrDomu, int nrLokalu, String miasto,
                            int idBiurka,
                            int intelekt) {
        super(imie, nazwisko, wiek, doswiadczenie, ulica, nrDomu, nrLokalu, miasto);
        this.idBiurka = idBiurka;
        this.intelekt = intelekt;
    }

    @Override
    public int wartoscDlaKorporacji() {
        return doswiadczenie*intelekt;
    }
}
