package Kamil_Wieczorek;

public enum Paliwo {
    prąd(1),
    benzyna(2),
    mięśnie(0);


    private int wartosc;

    Paliwo(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }
}
