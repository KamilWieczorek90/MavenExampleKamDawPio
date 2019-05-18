package Kamil_Wieczorek;

public class PracownikFizyczny extends Pracownik {
        private int sila;

    public int getSila() {
        return sila;
    }

    public PracownikFizyczny(String imie, String nazwisko, int wiek, int doswiadczenie, Adres adres, int sila) {
        super(imie, nazwisko, wiek, doswiadczenie, adres);
        if (sila >= 1 && sila <= 100) {
            this.sila = sila;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", sila= " + sila;
    }

    @Override
    public int wartoscDlaKorporacji() {
        return getDoswiadczenie() * sila / getWiek();
    }

    public void setSila(int sila) {
        this.sila = sila;
    }
}
//   Pracownik fizyczny - charakteryzuje się następującymi cechami istotnymi dla korporacji:
//        identyfikator pracownika - unikalny dla każdego pracownika w obrębie całej korporacji.
//        imię
//        nazwisko
//        wiek
//        doświadczenie
//        adres budynku w którym pracuje - adres powinien składać się z czterech elementów nazwy ulicy,
//        numeru budynku, numeru lokalu, nazwy miasta
//        siła fizyczna - wyrażona w skali od 1 - 100