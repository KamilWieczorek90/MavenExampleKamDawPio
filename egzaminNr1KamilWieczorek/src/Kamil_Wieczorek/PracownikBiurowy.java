package Kamil_Wieczorek;

public class PracownikBiurowy extends Pracownik {


    private int idBiurko = 1;
    private int iq;

    public PracownikBiurowy(String imie, String nazwisko, int wiek, int doswiadczenie, Adres adres, int idBiurko, int iq) {
        super(imie, nazwisko, wiek, doswiadczenie, adres);
        this.idBiurko = idBiurko++;
        if (iq >= 70 && iq <= 150) {
            this.iq = iq;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ ", w biurze, " +
                "biurko nr: " + idBiurko +
                ", IQ " + iq;
    }

    @Override
    public int wartoscDlaKorporacji() {
        return getDoswiadczenie()*iq;
    }
}

//    Pracownik biurowy - charakteryzuje się następującymi cechami istotnymi dla korporacji:
//        identyfikator pracownika - unikalny dla każdego pracownika w obrębie całej korporacji.
//        imię
//        nazwisko
//        wiek
//        doświadczenie
//        adres budynku w którym pracuje - adres powinien składać się z czterech elementów nazwy ulicy,
//        numeru budynku, numeru lokalu, nazwy miasta
//        identyfikator stanowiska biurowego - unikalny w skali całej korporacji
//        intelekt - wyrażony w iq w skali 70 - 150
//