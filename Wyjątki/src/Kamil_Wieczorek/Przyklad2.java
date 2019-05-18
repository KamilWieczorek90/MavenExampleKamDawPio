package programator02.exception.przyklad;

import java.util.Random;

public class Przyklad2 {
    public static void main(String args[]) {
        int    a = 0, b = 0, c = 0, j = 0;
        Random r = new Random();
        long time1 = System.currentTimeMillis(),
                time2;
        for(int i = 0; i < 100000000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345/(b/c);
            }
            catch (ArithmeticException e) {
                j++;
            }
        }
        time2=System.currentTimeMillis();
        System.out.println("\nj = "+ j);
        System.out.println("Time: " + (time2-time1));
    }

}
