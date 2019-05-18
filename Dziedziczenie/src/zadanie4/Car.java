package zadanie4;

public class Car {


    public Car() {

        System.out.println("Car construktor");

    }
    V12Engine silnik = new V12Engine();
    public void start(){
        System.out.println("startuje kluczykiem");
    }

}
