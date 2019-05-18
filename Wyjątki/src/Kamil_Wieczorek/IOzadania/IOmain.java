package Kamil_Wieczorek.IOzadania;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class IOmain {
    public static void main(String[] args) {

        ListaWyrazow lista = new ListaWyrazow("plik.txt");
        System.out.println(lista.getByValue("dassss"));
        System.out.println(lista.List());
    }
}
