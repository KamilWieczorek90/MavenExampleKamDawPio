package projekt2010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nazwaPliku = "";
        System.out.println("Który plik chcesz wczytać?");
        System.out.println("---------------------------");
        System.out.println("1. Wczytaj dane do bazy");
        System.out.println("2. Wyświetl tabelę 1");
        System.out.println("3. Wyświetl tabelę 2");
        System.out.println("4. Wyświetl tabelę 3");
        System.out.println("5. Wyświetl tabelę 4");
        System.out.print("Twój wybór to: ");

        int wybor = scanner.nextInt();
        if (wybor == 1){
            Pliki.wczytajDaneDostawcow();
            Pliki.wczytajDaneMagazynuP();
            Pliki.wczytajDaneMagazynuW();
            Pliki.wczytajSlownik();
        }

    }
}