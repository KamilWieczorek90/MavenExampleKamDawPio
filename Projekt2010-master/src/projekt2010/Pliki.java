package projekt2010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pliki {

    public static void wczytajDaneDostawcow() {

        // --- Wczytanie do listy dostawców ---
        List<Dostawca> listaDostawcow = new ArrayList<>();
        File plikDane = new File("dostawcy.csv");
        try{
            Scanner skaner = new Scanner(plikDane);
            while (skaner.hasNextLine()){
                String bufor = skaner.nextLine();
                String[] buforTable = bufor.split(";");
                String dostawcaNazwa = buforTable[0];
                String dostawcaMiejscowosc = buforTable[1];
                String dostawcaUlica = buforTable[2];
                String dostawcaNrKlienta = buforTable[3];
                Dostawca nowyDostawca = new Dostawca(dostawcaNazwa, dostawcaMiejscowosc, dostawcaUlica, dostawcaNrKlienta);
                listaDostawcow.add(nowyDostawca);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku \"dostawcy.csv\"!");
        }

//        for (Dostawca dostawca:listaDostawcow) {
//            System.out.printf("'%-36S'", dostawca.getNazwa());
//            System.out.printf("'%-36S'", dostawca.getMiejscowosc());
//            System.out.printf("'%-36S'", dostawca.getUlica());
//            System.out.printf("'%-5S'", dostawca.getNrKlienta());
//            System.out.println();
//        }
    }

    public static void wczytajDaneMagazynuP() {
        // --- Wczytanie do listy MagazynuP ---
        List<MagazynP> listaMagazynP = new ArrayList<>();
        File plikDane = new File("magazynp.csv");
        try {
            Scanner skaner = new Scanner(plikDane);
            while (skaner.hasNextLine()) {
                String bufor = skaner.nextLine();
                String[] buforTable = bufor.split(";");
                String nrKarty = buforTable[0];
                String dataD = buforTable[1];
                String masa = buforTable[2];
                String jednostka = buforTable[3];
                String firma = buforTable[4];
                String nrKlienta = buforTable[5];
                String nrOdpadu = buforTable[6];
                String nrMagazynowy = buforTable[7];
                MagazynP nowyMagazynP = new MagazynP(nrKarty, dataD, masa, jednostka, firma, nrMagazynowy, nrOdpadu, nrKlienta);
                listaMagazynP.add(nowyMagazynP);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku \"magazynp.csv\"!");
        }

//        for (MagazynP element: listaMagazynP) {
//            System.out.printf("'%-36S'", element.getNrKarty());
//            System.out.printf("'%-36S'", element.getFirma());
//            System.out.printf("'%-36S'", element.getJednostka());
//            System.out.printf("'%-5S'", element.getNrMagazynowy());
//            System.out.println();
//        }
    }

    public static void wczytajDaneMagazynuW() {
        // --- Wczytanie do listy MagazynuW ---
        List<MagazynW> listaMagazynW = new ArrayList<>();
        File plikDane = new File("magazynw.csv");
        try {
            Scanner skaner = new Scanner(plikDane);
            while (skaner.hasNextLine()) {
                String bufor = skaner.nextLine();
                String[] buforTable = bufor.split(";");
                String nrKarty = buforTable[0];
                String dataW = buforTable[1];
                String masa = buforTable[2];
                String jednostka = buforTable[3];
                String firma = buforTable[4];
                String nrKlienta = buforTable[5];
                String nrOdpadu = buforTable[6];
                String nrMagazynowy = buforTable[7];
                MagazynW nowyMagazynW = new MagazynW(nrKarty, dataW, masa, jednostka, firma, nrKlienta, nrOdpadu, nrMagazynowy);
                listaMagazynW.add(nowyMagazynW);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku \"magazynp.csv\"!");
        }
    }

    public static void wczytajSlownik() {
        // --- Wczytanie do listy Słownika ---
        List<Slownik> listaSlownik = new ArrayList<>();
        File plikDane = new File("slownik.csv");
        try {
            Scanner skaner = new Scanner(plikDane);
            while (skaner.hasNextLine()) {
                String bufor = skaner.nextLine();
                String[] buforTable = bufor.split(";");
                String grupa = buforTable[0];
                String podgrupa = buforTable[1];
                String rodzaj = buforTable[2];
                String typ = buforTable[3];
                String opis = buforTable[4];
                String nr_odpadu = buforTable[5];
                Slownik nowySlownik = new Slownik(grupa, podgrupa, rodzaj, typ, opis, nr_odpadu);
                listaSlownik.add(nowySlownik);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku \"magazynp.csv\"!");
        }
    }

}
