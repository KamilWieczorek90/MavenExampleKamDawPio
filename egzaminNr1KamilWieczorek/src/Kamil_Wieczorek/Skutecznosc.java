package Kamil_Wieczorek;

public enum Skutecznosc {
    NISKA(30),
    SREDNIA(60),
    WYSOKA(90);

    private int wartosc;

    Skutecznosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }
}
