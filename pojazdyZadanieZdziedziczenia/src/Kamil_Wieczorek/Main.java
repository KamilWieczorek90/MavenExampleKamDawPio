package Kamil_Wieczorek;

public class Main {

    public static void main(String[] args) {
	// write your code here

        RowerBuilder rw = new RowerBuilder();
        System.out.println(rw.getPojazd());
       // System.out.println(rw.withMarka("audi").withModel("a7").withRok(2019).getPojazd());

        System.out.println((new PojazdDirector()).construct(rw));

    }
}
