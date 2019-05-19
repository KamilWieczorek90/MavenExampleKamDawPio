package Kamil_Wieczorek.builder;

public enum TypPomieszczenia {
    KUCHNIA(3000),
    POKOJ(1000),
    LAZIENKA(2000);

    private double mnoznik;
    TypPomieszczenia(double mnoznik){
        this.mnoznik = mnoznik;
    }
    public double getMnoznik(){
        return mnoznik;
    }
}
