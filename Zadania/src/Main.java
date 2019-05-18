import Auta.Samochod;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod(2010, "Audi");

        samochod1.setLicznik(400000);
        System.out.println(samochod1);
        System.out.println(samochod2);
        System.out.println(samochod1.equals(samochod2));
        samochod1.podzielLicznik(4);
        System.out.println(samochod1.getLicznik());
    }
}
