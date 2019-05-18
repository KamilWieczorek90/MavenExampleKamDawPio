package zadanie4;

public class Main {
    public static void main(String[] args ) {
        TruckCar trackCar = new TruckCar();
        System.out.println(trackCar);

        Car car1 = new Car();
        TruckCar truck1 = new TruckCar();


        truck1.start();
        car1.start();
        Tir tir = new Tir();
        tir.start();

    }

}
