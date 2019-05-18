package w1.KamilWieczorek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<Address> adresy = new ArrayList<>();
        Address a1 = new Address("Wilno", "Niska", 1);
        Address a2 = new Address("Warszawa", "Niska", 2);
        Address a3 = new Address("Wilno", "Niska", 3);
        Address a4 = new Address("Wrocław", "Wysoka", 4);

        adresy.add(a1);
        adresy.add(a2);
        adresy.add(a3);
        adresy.add(a4);
       for (Address adres: adresy){
           System.out.println(adres);
       }
        Collections.sort(adresy, new SortujAlfabetycznie());
        System.out.println("---------------------------");
        for (Address adres: adresy){
            System.out.println(adres);
        }


    }
}
