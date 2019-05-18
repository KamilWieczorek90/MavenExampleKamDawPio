package map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args){
        Map<Car, String> mapa = new HashMap<>();
        for(int i= 0; i <10000; i++){
            Car car = new Car("BMW"+i);
            mapa.put(car, "car"+i);

        }
        System.out.println(mapa);
        long start = System.nanoTime();
        mapa.get(new Car("BMW44"));
        long stop = System.nanoTime();

        long czas = stop - start;
        System.out.println(czas);

    }
}
