package Kamil_Wieczorek;

public class Drzwi extends Stolarka {

    private SzerokoscDrzwi szerokoscDrzwi;

    public Drzwi(SzerokoscDrzwi szerokoscDrzwi){
        this.szerokoscDrzwi = szerokoscDrzwi;
        description = "Dzwi";
    }
    public double cost(){return szerokoscDrzwi.getWartosc()*10;}
}
