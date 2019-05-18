package Kamil_Wieczorek;

import java.util.Objects;

public class Karoseria {
    private String kolor;
    private Stan stan;

    public Karoseria(String kolor, Stan stan) {
        this.kolor = kolor;
        this.stan = stan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Karoseria)) return false;
        Karoseria karoseria = (Karoseria) o;
        return Objects.equals(kolor, karoseria.kolor) &&
                stan == karoseria.stan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kolor, stan);
    }

    @Override
    public String toString() {
        return "Karoseria{" +
                "kolor='" + kolor + '\'' +
                ", stan=" + stan +
                '}';
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Stan getStan() {
        return stan;
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }
}
