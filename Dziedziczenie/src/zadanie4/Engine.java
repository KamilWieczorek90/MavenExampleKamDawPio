package zadanie4;

public class Engine {
    SuperExtraSparkPlug a1 = new SuperExtraSparkPlug();

    @Override
    public String toString() {
        return "Engine{" +
                "a1=" + a1 +
                '}';
    }

    public Engine() {
        System.out.println("engine");
    }
}
