package Kamil_Wieczorek.stack;

import java.util.Objects;

public class Person {
    private String imie;
    private int wiek;

    public Person(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getWiek() == person.getWiek() &&
               getImie().equals(person.getImie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getWiek());
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
