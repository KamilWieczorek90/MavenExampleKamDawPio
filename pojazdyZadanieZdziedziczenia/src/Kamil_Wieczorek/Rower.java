package Kamil_Wieczorek;

import java.util.Objects;

public class Rower extends Pojazd {


    public Rower(int rok, String marka, String model) {
        super(rok, marka, model);

    }

    @Override
    public String toString() {
        return "Rower(" + super.toString() + ")";
    }
}
