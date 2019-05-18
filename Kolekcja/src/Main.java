import java.util.*;

public class Main {


    public static void main(String[] args) {

        Book book1 = new Book("Macierewicz","Sztuczna Inteligencja w starożytności",1900);
        Book book2 = new Book("Kaczynski","DwieWieże", 2019);
        Book book3 = new Book("GalAnonim", "Dzieje Piastów", 1415);
        Book book4 = new Book("Macierewicz","Sztuczna Inteligencja w starożytności",1900);
        Book book5 = new Book();

//    System.out.println(book1 == book2);
//    System.out.println(book1.equals(book2));
//    System.out.println(book1.hashCode() + " " + book2.hashCode());
//
//    System.out.println(book1 == book4);
//    System.out.println(book1.equals(book4));
//    System.out.println(book1.hashCode() + " " + book4.hashCode());

//        Set<Book> books = new HashSet<>();
//        books.add(book1);
//        books.add(book2);
//        books.add(book3);
//        books.add(book4);
//        books.add(book5);
//
//
//        for (Book book: books){
//            System.out.println(book);
//        }
//        System.out.println(books.size()
//        System.out.println(books.contains(book2));
//        books.remove(book3);
//        System.out.println(books.contains(book3));
//        System.out.println(books.isEmpty());
//        System.out.println();
        Map<String,Book> bookMap = new HashMap<>() {
            bookMap.put(1, book1);

        };




    }

}