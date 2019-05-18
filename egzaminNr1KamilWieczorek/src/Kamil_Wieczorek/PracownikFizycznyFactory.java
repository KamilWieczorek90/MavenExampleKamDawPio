package Kamil_Wieczorek;

import java.util.Calendar;

public class PracownikFizycznyFactory implements PracownikAbstractFactory{
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private int sila;
    private int doswiadczenie;
    private String miasto;
    private String ulica;
    private  int numerMieszkania;
    private  int numerLokalu;

    public PracownikFizycznyFactory(String imie, String nazwisko, int rok_urodzenia, int sila, int doswiadczenie, String miasto, String ulica, int numer_mieszkania) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rok_urodzenia;
        this.sila = sila;
        this.doswiadczenie = doswiadczenie;
        this.miasto = miasto;
        this.ulica = ulica;
        this.numerMieszkania = numer_mieszkania;
    }

    @Override
    public Pracownik createPracownik() {
        return new PracownikFizyczny(this.imie, this.nazwisko, (Calendar.getInstance().get(Calendar.YEAR) - this.rokUrodzenia) ,
                this.doswiadczenie, new Adres(this.ulica, this.numerMieszkania, this.numerLokalu, this.miasto ), this.sila);
    }
}
