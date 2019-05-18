package Kamil_Wieczorek;

public class Main {

    public static void main(String[] args) {

        //Test i produkcja dekoratora drzwi
        Stolarka drzwi1 = new Drzwi(SzerokoscDrzwi.MALE);
        Stolarka drzwi2 = new Drzwi(SzerokoscDrzwi.SREDNIE);
        Stolarka drzwi3 = new Drzwi(SzerokoscDrzwi.DUZE);

        drzwi2 = new DekoratorAntywlamaniowy(drzwi2);
        drzwi3 = new DekoratorAntywlamaniowy(drzwi3);
        drzwi3 = new DekoratorAntywlamaniowy(drzwi3);

        System.out.println(drzwi3.getDescription() + " $" + drzwi3.cost());
        System.out.println(drzwi1.getDescription() + " $" + drzwi1.cost());
        //Test i produkcja dekoratora okien
        Stolarka okno1 = new Okno(40, 120);
        Stolarka okno2 = new Okno(120, 120);
        Stolarka okno3 = new Okno(200, 120);

        okno2 = new DekoratorAntywlamaniowy(okno2);
        System.out.println(okno2.getDescription() + " $" + okno2.cost());

        KuchniaBuilder kb = new KuchniaBuilder();
	    Pomieszczenie kuchnia = kb.buildPowierzchnia(20)
                                    .buildStolarka(okno2)
                                    .buildStolarka(drzwi2)
                                    .build();

        System.out.println(kuchnia);

    }
}

