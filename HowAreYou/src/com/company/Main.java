

package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int suma(int a, int b){
        return a+b;
    }

    public static double sinus(int n){
        return Math.sin(n);
    }

    public static void informacja(){
        System.out.println("To jest przykład wyświetlania menu z "
                + "zastosowaniem instrukji switch.");
    }

    public static int menu(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Suma");
        System.out.println("     2. Sinus");
        System.out.println("     3. Informaja");
        System.out.println("     0. Koniec");

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();

        return w;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int wybor = menu();

        while(wybor!=0){
            switch(wybor){
                case 1:
                    int a, b;
                    System.out.println("Podaj dwie liczby do zsumowania");
                    a = in.nextInt();
                    b = in.nextInt();

                    int wynik = suma(a,b);

                    System.out.format("Suma liczb wynosi "+wynik);

                    break;

                case 2:
                    System.out.println("Podaj liczbę do obliczenia sinusa");
                    a = in.nextInt();

                    double wynik2 = sinus(a);

                    System.out.format("Sinus wynosi "+wynik2);

                    break;

                case 3:
                    informacja();

            }

            System.out.println("\nWciśnij Enter, aby kontynuować...");
            System.in.read();

            wybor = menu();
        }


        System.out.println("     ****************************************");
        System.out.println("\n     Koniec programu\n\n");
    }
}