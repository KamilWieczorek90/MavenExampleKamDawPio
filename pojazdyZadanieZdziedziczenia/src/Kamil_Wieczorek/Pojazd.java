package Kamil_Wieczorek;


public  abstract class Pojazd {
     private int rok;
     private String marka;
     private String model;



    public Pojazd(int rok, String marka, String model) {
        this.rok = rok;
        this.marka = marka;
        this.model = model;

    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "rok=" + rok +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
