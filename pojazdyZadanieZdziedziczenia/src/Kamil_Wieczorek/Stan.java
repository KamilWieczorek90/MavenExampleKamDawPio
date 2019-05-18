package Kamil_Wieczorek;

public enum Stan {nowy(0), prawie_nowy(1),wrak(2);
    private int wartosc;

    Stan(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }
}
