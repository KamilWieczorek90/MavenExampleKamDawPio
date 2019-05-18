package egzamin1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RejestrPracownikow {

    List<Pracownik> pracownicy = new ArrayList<>();

    void dodajPracownikaBiurowego(PracownikBiurowy pracownik) {
        pracownicy.add(pracownik);
    }

    void dodajPracownikaFizycznego(PracownikFizyczny pracownik) {
        pracownicy.add(pracownik);
    }

    void dodajHandlarza(Handlarz pracownik) {
        pracownicy.add(pracownik);
    }

    void dodajPracownikow(List<Pracownik> pracownicy) {
        this.pracownicy.addAll(pracownicy);
    }

    void usunPracownika(int id) {
        for (int i = 0; i < pracownicy.size(); i++) {
            Pracownik pracownik = pracownicy.get(i);
            if (pracownik.id == id) {
                pracownicy.remove(i);
                break;
            }
        }
    }

    void wyswietlPracownikow() {
        Collections.sort(pracownicy, new PracownikComparator());
        for(Pracownik pracownik : pracownicy) {
            System.out.println(pracownik);
        }
    }

    void wyswieltPracownikowWgMiasta(String miasto) {
        for(Pracownik pracownik : pracownicy) {
            if(pracownik.adres != null && pracownik.adres.miasto.equalsIgnoreCase(miasto)) {
                System.out.println(pracownik);
            }
        }
    }

    void wyswietlPracownikowZWartosciaDlaKorporacji() {
        for(Pracownik pracownik : pracownicy) {
            System.out.println(pracownik + " " + pracownik.wartoscDlaKorporacji());
        }
    }

}
