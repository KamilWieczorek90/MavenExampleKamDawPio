package set;

public class Pileczka {
    private int numer;
    Color color;


    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Pileczka(int numer, Color color) {
        this.numer = numer;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Pileczka{" +
                "numer=" + numer +
                ", color=" + color +
                '}';
    }
}
