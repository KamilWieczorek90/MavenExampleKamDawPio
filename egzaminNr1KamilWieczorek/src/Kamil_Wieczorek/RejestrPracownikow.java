package Kamil_Wieczorek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RejestrPracownikow {


    List<Pracownik> pracownicy = new ArrayList<>();

    public void dodajPracownikaBiurowego(PracownikBiurowy pracownik) {
        pracownicy.add(pracownik);
    }

    public void dodajPracownikaFizycznego(PracownikFizyczny pracownik) {
        pracownicy.add(pracownik);
    }

    public void dodajHandlarza(Handlarze pracownik) {
        pracownicy.add(pracownik);
    }

    public void dodajPracownikow(List<Pracownik> pracownicy) {
        this.pracownicy.addAll(pracownicy);
    }



    public void wyswietlPracownikow() {
        Collections.sort(pracownicy, new SortujPoWartosci());
        for(Pracownik pracownik : pracownicy) {
            System.out.println(pracownik);
        }
    }

   public void wyswietlPracownikowZWartosciaDlaKorporacji() {wyswietlPracownikow();
        for(Pracownik pracownik : pracownicy) {
            System.out.println(pracownik + " " + pracownik.wartoscDlaKorporacji());
        }
    }

    @Override
    public String toString() {
        return "RejestrPracownikow{" +
                "pracownicy=" + pracownicy +
                '}';
    }
}
