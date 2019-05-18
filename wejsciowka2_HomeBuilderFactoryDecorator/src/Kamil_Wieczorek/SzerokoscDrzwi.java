package Kamil_Wieczorek;

public enum SzerokoscDrzwi {
    MALE(70),
    SREDNIE(90),
    DUZE(110);

    private int wartosc;
    SzerokoscDrzwi(int wartosc){this.wartosc = wartosc;}
    public int getWartosc(){ return wartosc;}
}
