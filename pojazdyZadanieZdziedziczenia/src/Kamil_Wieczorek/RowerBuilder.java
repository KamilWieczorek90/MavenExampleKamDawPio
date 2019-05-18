package Kamil_Wieczorek;

public class RowerBuilder extends PojazdBuilder {
    @Override
    protected Pojazd build() {
        return new Rower(this.getRok(), this.getMarka(), this.getModel());
    }
}
