package Kamil_Wieczorek;

public class Handlarze extends Pracownik {
         private Skutecznosc skutecznosc;
         private int prowizja;

    public Handlarze(String imie, String nazwisko, int wiek, int doswiadczenie, Adres adres, Skutecznosc skutecznosc, int prowizja) {
        super(imie, nazwisko, wiek, doswiadczenie, adres);
        this.skutecznosc = skutecznosc;
        this.prowizja = prowizja;
    }

    @Override
    public String toString() {
        return super.toString() + skutecznosc
                + " skutecznosc";
    }

    @Override
    public int wartoscDlaKorporacji() {
        return getDoswiadczenie() * skutecznosc.getWartosc();
    }

    public Skutecznosc getSkutecznosc() {
        return skutecznosc;
    }

    public void setSkutecznosc(Skutecznosc skutecznosc) {
        this.skutecznosc = skutecznosc;
    }

    public int getProwizja() {
        return prowizja;
    }

    public void setProwizja(int prowizja) {
        this.prowizja = prowizja;
    }
}

//Handlarz - charakteryzuje się następującymi cechami istotnymi dla korporacji:
//        identyfikator pracownika - unikalny dla każdego pracownika w obrębie całej korporacji.
//        imię
//        nazwisko
//        wiek
//        doświadczenie
//        adres budynku w którym pracuje - adres powinien składać się z czterech elementów nazwy ulicy, numeru budynku, numeru lokalu, nazwy miasta
//        skuteczność - wyrażona w trzech stałych typach “NISKA”, “ŚREDNIA”, “WYSOKA”
//        wysokość prowizji - wyrażona w procentach
//
