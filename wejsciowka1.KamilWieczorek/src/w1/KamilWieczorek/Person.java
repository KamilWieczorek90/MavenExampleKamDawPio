package w1.KamilWieczorek;

import java.util.Objects;

public class Person {
    private String name;
    private int yearOfBirth;
    Address adress;

    public Person() {
    }

    public Person(String name, int yearOfBirth, Address adress) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth> 1950 && yearOfBirth < 2000){
            //nie wiem gdzie i jak to zwalidowac, czy  tym bloku metody set() czy w mainie zrobic jakiegos ifa, ktory bedzie sprawdzal parametr metody set?
        }

    }

    public Address getAdress() {
       return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getYearOfBirth() == person.getYearOfBirth() &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getAdress(), person.getAdress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYearOfBirth(), getAdress());
    }

    @Override
    public String toString() {
        return  "Person: " + name +
                ", ur.: " + yearOfBirth +
                ", zamieszkały: " + adress;
    }
}

//Person: Kowalski, ur.: 1950, zamieszkały: Łódź ul. Długa nr 15

//Zadanie 1.
//        Zaimplementuj klasę Person posiadającą pola: name typu String,
//        yearOfBirth typu int
//        oraz address typu Address,
//        gdzie Address jest klasą posiadająca pola typu String:
//        city, street oraz number typu int,
//        reprezentujący numer budynku.
//        Obie klasy powinny posiadać:
//        Konstruktory: bezargumentowy oraz umożliwiający ustawianie wszystkich pól obiektu
//        Gettery i settery:
//        settery powinny realizować następujące sprawdzenia poprawności wprowadzanych wartości do pól:
//        name: powinno się rozpoczynać od dużej litery
//        yearOfBirth: powinien być z przedziału od 1950 do 2000
//        Implementację metody toString() dziedziczonej z klasy Object, prezentującą obiekt klasy Person w następujący sposób:
//        Person: Kowalski, ur.: 1950, zamieszkały: Łódź ul. Długa nr 15
//        Implementację metod equals() i hashCode() dziedziczonych z klasy Object.
//        Utwórz klasę PersonMain i w jej metodzie main(...) prezentującą:
//        tworzenie obiektu Person za pomocą obu konstruktorów
//        wyjaśnienie różnic pomiędzy wykorzystaniem na obiektach klasy Person operacji == oraz metody equals() i porównaniem wyników metody hashCode() dla tych samych obiektów.
//
//
