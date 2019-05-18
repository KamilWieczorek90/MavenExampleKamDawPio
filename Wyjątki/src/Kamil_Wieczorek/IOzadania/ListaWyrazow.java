package Kamil_Wieczorek.IOzadania;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaWyrazow implements InterfejsIO{

    private List<String> lista;

    public ListaWyrazow(String file) {
        this.lista = new ArrayList<>();

        try {
            Scanner s = new Scanner(new File(file));
            while (s.hasNext()){
                lista.add(s.next());
            }
            s.close();

        }catch(NullPointerException e) {
            System.out.println("Scieżka nie moze byc pusta." + e);
        }catch (IOException e){
            System.out.println("IOex" + e);
        }
    }

    @Override
    public int getByValue(String value) {
      return this.lista.indexOf(value);
    }

    @Override
    public List<String> List() {
        return this.lista;
    }
}

