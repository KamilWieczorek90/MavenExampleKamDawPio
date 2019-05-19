package Kamil_Wieczorek;

public class Drzwi extends Stolarka {

    private SzerokoscDrzwi szerokoscDrzwi;

    public Drzwi(SzerokoscDrzwi szerokoscDrzwi){
        this.szerokoscDrzwi = szerokoscDrzwi;
        description = "Dzwi";
    }
    public double cost(){return szerokoscDrzwi.getWartosc()*10;}

    public enum SzerokoscDrzwi {
        MALE(70),
        SREDNIE(90),
        DUZE(110);

        private int wartosc;
        SzerokoscDrzwi(int wartosc){this.wartosc = wartosc;}
        public int getWartosc(){ return wartosc;}
    }
}
