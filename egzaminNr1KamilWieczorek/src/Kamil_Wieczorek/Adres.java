package Kamil_Wieczorek;

import java.util.Objects;

public class Adres {
        private String ulica;
        private int numerBudynku;
        private int numerLokalu;
        private String city;

    public Adres(String ulica, int numerBudynku, int numerLokalu, String city) {
        this.ulica = ulica;
        this.numerBudynku = numerBudynku;
        this.numerLokalu = numerLokalu;
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "ul. " + ulica +
                ", budynek " + numerBudynku +
                ", lokal " + numerLokalu +
                ", w mieście " + city;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerBudynku() {
        return numerBudynku;
    }

    public void setNumerBudynku(int numerBudynku) {
        this.numerBudynku = numerBudynku;
    }

    public int getNumerLokalu() {
        return numerLokalu;
    }

    public void setNumerLokalu(int numerLokalu) {
        this.numerLokalu = numerLokalu;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adres)) return false;
        Adres adres = (Adres) o;
        return getNumerBudynku() == adres.getNumerBudynku() &&
                getNumerLokalu() == adres.getNumerLokalu() &&
                Objects.equals(getUlica(), adres.getUlica()) &&
                Objects.equals(getCity(), adres.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUlica(), getNumerBudynku(), getNumerLokalu(), getCity());
    }
}
//        adres budynku w którym pracuje - adres powinien składać się z czterech elementów nazwy ulicy,
//        numeru budynku, numeru lokalu, nazwy miasta