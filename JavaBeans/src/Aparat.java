public class Aparat {
    private int mgp;
    private boolean szerokiKat;

    public Aparat(int mgp, boolean szerokiKat) {
        this.mgp = mgp;
        this.szerokiKat = szerokiKat;
    }

    public int getMgp() {
        return mgp;
    }

    public void setMgp(int mgp) {
        this.mgp = mgp;
    }

    public boolean isSzerokiKat() {
        return szerokiKat;
    }

    public void setSzerokiKat(boolean szerokiKat) {
        this.szerokiKat = szerokiKat;
    }

    @Override
    public String toString() {
        return "Aparat{" +
                "mgp=" + mgp +
                ", szerokiKat=" + szerokiKat +
                '}';
    }
}
