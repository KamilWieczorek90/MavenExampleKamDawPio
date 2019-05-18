package Kamil_Wieczorek;

public enum PoziomEmisjiSpalin {duży(2), średni(1), niski(0);
    private int wartosc;

    PoziomEmisjiSpalin(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }
}
