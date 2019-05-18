package programator02.exception.przyklad;

public class Przyklad1 {
    public static void main(String args[]) {
        try {
            int a = 2;
            System.out.println("a = " + a);
            int b = 2 / a;
            int c[] = { 1, 2 };
            c[b] = 99;
        } catch (ArithmeticException ex) {
            System.out.println("Dzielenie przez 0: " + ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Indeks tablicy poza zakresem: " + ex);
        } catch (Exception ex){
            System.out.println("Nieznany wyjątek: " + ex);
        }
        System.out.println("Poza try/catch");
    }
}
