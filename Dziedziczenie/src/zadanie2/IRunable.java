package zadanie2;

public interface IRunable {
    default void run(){
        System.out.println("biegne");
    }
}
