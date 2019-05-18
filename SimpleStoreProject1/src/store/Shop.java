package store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shop {
    Scanner akcja = new Scanner(System.in);

    Product jajka = new Product("001", "jajka" ,10,7);
    Product pomidory = new Product("002", "pomidory", 5, 3.5);
    Product maslo = new Product("003", "masło", 7, 4.9);
    Product mleko = new Product("004", "mleko", 3, 2);
    Product pampers = new Product("005" , "pieluchomajtki", 50, 35);
    Product pampersXL = new Product("006", "pieluchomajtkiXXL", 100, 70);

    List<Product> sklep = new ArrayList<>();
    Cart cart = new Cart();

    public void start(){
        sklep.add(jajka);
        sklep.add(pomidory);
        sklep.add(maslo);
        sklep.add(mleko);
        sklep.add(pampers);
        sklep.add(pampersXL);
        Collections.sort(sklep, new SortujPoCenie()); //w tym miejscu sortujemy Asortyment w sklepie
        // nieskonczona petla ktora wyswietla menu
        while(true){
            menu();
        }
    }
    private void menu(){
        System.out.println("1. Wyświetl asortyment.");
        System.out.println("2. Dodaj do koszyka.");
        System.out.println("3. Usuń z koszyka.");
        System.out.println("4. Wyświetl koszyk.");
        System.out.println("5. Kod rabatowy.");
        System.out.println("6. Przejdż do kasy.");
        System.out.println("7. Idź do bankomatu.");
        System.out.println("9. Wyjscie");
        System.out.println("---------------------------------------------------,");
        System.out.print("Wpisz numer wybranej akcji: ");
        int scanner = akcja.nextInt();
        System.out.println("---------------------------------------------------'");
        if (scanner == 1){
            System.out.println();
            System.out.println("<<<<<<<<<<<<<<<< Nasze Produkty >>>>>>>>>>>>>>>>>>");
            wyswietlAsortyment();
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println();
        }else if(scanner == 2){
            System.out.println();
            System.out.print("Podaj numer produktu, który chcesz dodac do koszyka: ");
            int productIndex = akcja.nextInt();
            // pobranie produktu ze sklepu i dodanie do koszyka
            cart.addProduct(sklep.get(productIndex - 1));
            System.out.print(sklep.get(productIndex - 1));
            System.out.println(" - dodano do koszyka.");
            System.out.println();

        }else if(scanner == 3){
            //"Ktory produkt usunąć?"
            //cart.remove produkt - "produkt usuniety"
        }else if(scanner == 4){
            // wyswietlanie koszyka
            System.out.println("           Twój koszyk:");
            cart.wyswietl();
            System.out.print("Wartość koszyka: ");
            System.out.println(cart.wyliczWartoscKoszyka() + "zl");
            System.out.println("-------------------------------------");

        }else if(scanner == 5){
            // "wprowadź kod rabatowy:  "
            // dodawanie kodu do obiektu cart
            // jednorazowy, czyli iterowanie po koszyku i zmienianie ceny na discount price,
            // sprawdzanie czy dany kod zostal juz dodany do koszyka zeby nie powielac kodow
            //pole kodRabatowy w cart? zmiana ceny dopiero w podliczeniu?
        }else if(scanner == 6){
            // wyliczenie wartosci wraz z uwzgledniemem promocji, rabatow itp i wyswietlenie, oraz wyjscie z aplikacji
            //            // System.exit(0);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Wydruk paragonu.");
            System.out.print("Wartość koszyka: ");
            System.out.println(cart.wyliczWartoscKoszyka() + "zl");


        } else if(scanner == 7){
            //idź do bankomatu
            //dostepne środki
            // wpłać/wypłać pieniądze

        } else if(scanner == 9) {
            System.exit(0);
        } else {
            System.out.println("Nieprawidłowa akcja");
        }

    }
    private void wyswietlAsortyment(){
        int i = 1;
        for (Product product: sklep){
            System.out.print(i + ". ");
            System.out.println(product);
            i++;
        }
    }

}
