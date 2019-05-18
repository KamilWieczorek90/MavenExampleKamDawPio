package zadanie4;

public class TruckCar extends Car{

    @Override
    public String toString() {
        return "TruckCar{" +
                "silnik=" + silnik +
                '}';
    }

    public TruckCar() {
        System.out.println("trackcar");

    }

//    public  void start(){
//        System.out.println("startuje przyciskiem");
//        super.start();
//    }

}
