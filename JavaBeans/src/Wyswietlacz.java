public class Wyswietlacz {
    private String refNumber;
    private String model;
    private  int size;
    private String resolution;

    public Wyswietlacz(String refNumber, String model, int size, String resolution) {
        this.refNumber = refNumber;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Wyswietlacz{" +
                "refNumber='" + refNumber + '\'' +
                '}';
    }
}
