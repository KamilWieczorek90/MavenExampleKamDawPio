package Kamil_Wieczorek;

import java.util.Objects;

public class Silnik {
    private Paliwo paliwo;
    private int maxMoc;
    private PoziomEmisjiSpalin poziomEmisjiSpalin;

    public Silnik(Paliwo paliwo, int maxMoc, PoziomEmisjiSpalin poziomEmisjiSpalin) {
        this.paliwo = paliwo;
        this.maxMoc = maxMoc;
        this.poziomEmisjiSpalin = poziomEmisjiSpalin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Silnik)) return false;
        Silnik silnik = (Silnik) o;
        return maxMoc == silnik.maxMoc &&
                paliwo == silnik.paliwo &&
                poziomEmisjiSpalin == silnik.poziomEmisjiSpalin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paliwo, maxMoc, poziomEmisjiSpalin);
    }

    @Override
    public String toString() {
        return "Silnik{" +
                "paliwo=" + paliwo +
                ", maxMoc=" + maxMoc +
                ", poziomEmisjiSpalin=" + poziomEmisjiSpalin +
                '}';
    }

    public Paliwo getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(Paliwo paliwo) {
        this.paliwo = paliwo;
    }

    public int getMaxMoc() {
        return maxMoc;
    }

    public void setMaxMoc(int maxMoc) {
        this.maxMoc = maxMoc;
    }

    public PoziomEmisjiSpalin getPoziomEmisjiSpalin() {
        return poziomEmisjiSpalin;
    }

    public void setPoziomEmisjiSpalin(PoziomEmisjiSpalin poziomEmisjiSpalin) {
        this.poziomEmisjiSpalin = poziomEmisjiSpalin;
    }
}
