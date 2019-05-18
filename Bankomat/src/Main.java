//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Konto konto = new Konto();
//        Konto konto2 = new Konto();
//        Scanner scanner = new Scanner(System.in);
//        konto.setStan(10000);
//        konto2.setStan(5000);
//        System.out.println("Witamy w Bankomacie!");
//        System.out.println("--------------------");
//        while(true){
//            System.out.println("1. Wplać pieniądze.");
//            System.out.println("2. Wypłać pieniądze.");
//            System.out.println("3. Wyświetl stan konta.");
//            System.out.println("4. Przelej na drugie kotno.");
//            System.out.println("5. Wyświetl stan drugiego konta.");
//            System.out.println("9. Wyjście. ");
//            System.out.println("--------------------");
//        int sc = scanner.nextInt();
//        if(sc == 1){
//            System.out.print("Ile wpłacić pieniędzy? ");
//            double dodaj = scanner.nextDouble();
//            konto.wplac(dodaj);
//            System.out.println();
//
//        }else if (sc == 2){
//            System.out.print("Ile wypłacić pieniędzy? ");
//            double odejmij = scanner.nextDouble();
//            konto.wyplac(odejmij);
//            System.out.println();
//
//        }else if (sc == 3){
//            System.out.println("Twój stan konta wynosi = " + konto.getStan() +"zł");
//            System.out.println();
//
//        }else if (sc == 4){
//            System.out.println("Ile pieniędzy chcesz przelać na drugie konto?");
//            double przelew = scanner.nextDouble();
//            konto.setStan(konto.getStan()-przelew);
//            konto2.przelej(przelew,konto2);
//            System.out.println();
//
//        }else if (sc == 5){
//            System.out.println("Stan drugiego konta wynosi:" + konto2.getStan()+ "zł");
//            System.out.println();
//
//        }else if (sc == 9){
//            System.out.println("Do widzenia!");
//            System.exit(0);
//            System.out.println();
//
//        }
//        }
//
//    }
//}
