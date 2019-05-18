package Kamil_Wieczorek;

public abstract class PojazdBuilder {
    private int rok;
    private String marka;
    private String model;

    private void init() {
        this.rok = 1990;
        this.marka = "";
        this.model = "";
    }

    public int getRok() {
        return rok;
    }


    public String getMarka() {
        return marka;
    }



    public String getModel() {
        return model;
    }

    public PojazdBuilder() {
        init();
    }

    protected abstract Pojazd build();

    public Pojazd getPojazd() {
        return build();
    }

    public PojazdBuilder withRok(int rok) {
        this.rok = rok;
        return this;
    }

    public PojazdBuilder withMarka(String marka) {
        this.marka = marka;
        return this;
    }

    public PojazdBuilder withModel(String model) {
        this.model = model;
        return this;
    }
    public PojazdBuilder reset(){
        init();
        return this;
    }


}
