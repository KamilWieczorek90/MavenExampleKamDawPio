package Kamil_Wieczorek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Adres adres1 = new Adres("Wysoka", 5, 3, "Warszawa");
        Adres adres2 = new Adres("Dolna", 2, 1, "Bydgoszcz");
        Adres adres3 = new Adres("Pusta", 1, 4, "Warszawa");
//        System.out.println(adres1);
        
//        System.out.println(adres2);
//        System.out.println(adres3);


        testAbstractFactory();











        PracownikBiurowy workerB1 = new PracownikBiurowy("Marjan", "Paton", 56, 20, adres1, 1, 110);
        PracownikBiurowy workerB2 = new PracownikBiurowy("Tadeusz", "Wikol", 46, 12, adres2, 1, 100);
        PracownikBiurowy workerB3 = new PracownikBiurowy("Tymoteusz", "Karnas", 35, 5, adres3, 1, 100);
        //kiedy wartosc iq nie bedzie odpowiadala walidacji to maszyna wirtualna przypisze 0
      //  PracownikFizyczny workerF1 = new PracownikFizyczny("Kamil", "Wie", 29, 5, adres1, 100);
        PracownikFizyczny workerF2 = new PracownikFizyczny("Kaziu", "Rogaty", 40, 10, adres2, 60);
        PracownikFizyczny workerF3 = new PracownikFizyczny("Daniel", "Pyza", 33, 4, adres3, 70);
//
//        List<Pracownik> pracownikFizycznyList = new ArrayList<>();
//        pracownikFizycznyList.add(workerF1);
//        pracownikFizycznyList.add(workerF2);
        // pracownikFizycznyList.add(workerB1);
        //sprawdzanie czy mozna dodac pracownika z innej klasy
//        pracownikFizycznyList.add(workerF3);
//
//        List<Pracownik> pracownicyBiurowi = new ArrayList<>();
//        pracownicyBiurowi.add(workerB1);
//        pracownicyBiurowi.add(workerB2);
//        pracownicyBiurowi.add(workerB3);
//
//        for (Pracownik pracownik : pracownicyBiurowi) {
//            System.out.println(pracownik);
//        }
//        Collections.sort(pracownicyBiurowi, new SortujPoWartosci());
//        System.out.println();
//
//
//        for (Pracownik pracownik : pracownicyBiurowi) {
//            System.out.println(pracownik);
//        }
//
//        RejestrPracownikow rejestr1 = new RejestrPracownikow();
//
//        rejestr1.dodajPracownikaBiurowego(workerB1);
//        rejestr1.dodajPracownikaBiurowego(workerB2);
//        rejestr1.dodajPracownikaBiurowego(workerB3);
//
//        rejestr1.dodajPracownikaFizycznego(workerF1);
//        rejestr1.dodajPracownikaFizycznego(workerF2);
//        rejestr1.dodajPracownikaFizycznego(workerF3);
//
//        rejestr1.dodajPracownikow(pracownicyBiurowi); // dodawanie listy do rejestru
//        rejestr1.wyswietlPracownikow();
//
//        System.out.println("----------------------------");
//        System.out.println(rejestr1);
    }









//
//Egzamin 1
//        Napisz program który reprezentował będzie rejestr pracowników w jednej ze światowych korporacji.
//        Jako wytyczną przyjmij fakt, iż korporacja charakteryzuje się trzema podstawowymi typami zatrudnionych pracowników:
//
//        Pracownik biurowy - charakteryzuje się następującymi cechami istotnymi dla korporacji:
//        identyfikator pracownika - unikalny dla każdego pracownika w obrębie całej korporacji.
//        imię
//        nazwisko
//        wiek
//        doświadczenie
//        adres budynku w którym pracuje - adres powinien składać się z czterech elementów nazwy ulicy,
//        numeru budynku, numeru lokalu, nazwy miasta
//        identyfikator stanowiska biurowego - unikalny w skali całej korporacji
//        intelekt - wyrażony w iq w skali 70 - 150
//
//        Pracownik fizyczny - charakteryzuje się następującymi cechami istotnymi dla korporacji:
//        identyfikator pracownika - unikalny dla każdego pracownika w obrębie całej korporacji.
//        imię
//        nazwisko
//        wiek
//        doświadczenie
//        adres budynku w którym pracuje - adres powinien składać się z czterech elementów nazwy ulicy,
//        numeru budynku, numeru lokalu, nazwy miasta
//        siła fizyczna - wyrażona w skali od 1 - 100
//
//        Handlarz - charakteryzuje się następującymi cechami istotnymi dla korporacji:
//        identyfikator pracownika - unikalny dla każdego pracownika w obrębie całej korporacji.
//        imię
//        nazwisko
//        wiek
//        doświadczenie
//        adres budynku w którym pracuje - adres powinien składać się z czterech elementów nazwy ulicy,
//        numeru budynku, numeru lokalu, nazwy miasta
//        skuteczność - wyrażona w trzech stałych typach “NISKA”, “ŚREDNIA”, “WYSOKA”
//        wysokość prowizji - wyrażona w procentach
//
//        Rejestr powinien umożliwić realizację następujących zadań:
//
//        Dodanie dowolnego z typów pracownika do rejestru.
//        Usunięcie pracownika o danym identyfikatorze pracowniczym z rejestru.
//        Dodanie kilku pracowników o różnych typach na raz do rejestru.
//        Wyświetlenie listy wszystkich pracowników posortowanych po liczbie lat doświadczenia (malejąco),
//        następnie po wieku pracownika (rosnąco), następnie po nazwisku pracownika (zgodnie z kolejnością alfabetyczną).
//        Wyświetlenie listy pracowników, którzy pracują w mieście po nazwie podanej jako parametr wejściowy.
//        Wyświetlenie listy wszystkich pracowników wraz  z ich wartością dla korporacji,
//        przy czym dla każdego z typów pracownika stopień wartości obliczany jest w inny sposób:
//
//        dla pracownika biurowego - wartość dla korporacji obliczana jest ze wzoru doświadczenie * intelekt
//        dla pracownika fizycznego - wartość dla korporacji obliczana jest ze wzoru doświadczenie * siła / wiek
//        dla handlowca - wartość dla korporacji obliczana jest ze wzoru doświadczenie * skuteczność gdzie odpowiedni typ
//        skuteczności zamieniany jest na wartość
//
//        NISKA
//        60
//        ŚREDNIA
//        90
//        WYSOKA
//        120
//
//
//        Zastanów się w jaki sposób zamodelować obiekt pracownika w programie, zważywszy na to,
//        że spora ilość cech jest wspólna dla każdego z poszczególnych typów pracownika.
//        Wszystkie obiekty rejestru przechowuje w pamięci komputera w wybranej przez Ciebie kolekcji
//        (Zastanów się która z kolekcji będzie najlepiej realizować zadania związane z rejestrem pracowników).
//
//
//        Po zakończeniu implementacji proszę pliki zawierające rozwiązanie (tylko pliki *.java) spakować do
//            archiwum mojeImięNazwiskoEgzamin1.zip  i przesłać na adres email:
//        t.borzyszkowski@gmail.com z tematem: Imię Nazwisko: Egzamin1
//
//
//        Punktacja:
//        Tworzenie klas - 20%
//        Kompozycja - 10%
//        Dziedziczenie - 20 %
//        Implementacje interfejsów (Comparator) - 20%
//        Praca z kolekcjami - 20%
//        Polimorfizm - 10%
private static void testAbstractFactory() {
    Pracownik fizyczny = PracownikFactory.getPracownik(
            new PracownikFizycznyFactory("kam","wie",1990, 10, 5, "bdg","biala", 5  )
    );

    System.out.println("AbstractFactory PracownikFizyczny Config::" + fizyczny);

}
}