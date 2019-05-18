package Kamil_Wieczorek;

public class Okno extends Stolarka {
    double szerokosc;
    double wysokosc;

    public Okno(double szerokosc, double wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        description = ("Okno " +getSzerokosc()+ "x" + getWysokosc()) ;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double cost(){
        return szerokosc*wysokosc/10;
    }
}
