package Auta;

import java.util.Objects;

public class Samochod {
    private int rocznik;
    private String marka;
    private int licznik;
    private Kola kola;
    public int getLicznik() {
        return licznik;
    }
    public void podzielLicznik(int dzielnik){
        this.licznik /= dzielnik;

    }
    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }



    public Samochod() {
        this.rocznik = 0;
        this.marka = "nieznana";
    }

    public Samochod(int rocznik, String marka) {
        this.rocznik = rocznik;
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public int getRocznik() {
        return rocznik;
    }
    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Samochod)) return false;
        Samochod samochod = (Samochod) o;
        return getRocznik() == samochod.getRocznik() &&
                getMarka().equals(samochod.getMarka());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRocznik(), getMarka());
    }
}
