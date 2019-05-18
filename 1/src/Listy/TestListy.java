package Listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListy {
    public static void main(String [] args){

        List<String> arrayList = new ArrayList();
        List<String> linkedList = new LinkedList();

        initList(10000, arrayList);
        initList(10000, linkedList);

        long start = System.nanoTime();
        arrayList.get(arrayList.size() / 2);
        long stop = System.nanoTime();
        long roznica = stop - start;
        System.out.println(roznica+ "arryay");

        long start2 = System.nanoTime();
        linkedList.get(linkedList.size() / 2);
        long stop2 = System.nanoTime();
        long roznica2 = stop2 - start2;
        System.out.println(roznica2 + " linked");

        System.out.println("Koniec");
/*      Exeption concurrentModification!!!
        for(String string : arrayList){
            System.out.println(string);
            if (string.equals("value5")){
                arrayList.remove(string);
            }
        }*/
    }
    private static void initList(int amount, List<String> lista){
        for(int i = 0; i < amount ; i++){
            lista.add("value" + i);

        }

    }

}




