package projekt2010;

public class Slownik {

    private String grupa, podgrupa, rodzaj, typ, opis, nr_odpadu;

    public Slownik(String grupa, String podgrupa, String rodzaj, String typ, String opis, String nr_odpadu){
        this.grupa = grupa;
        this.podgrupa = podgrupa;
        this.rodzaj = rodzaj;
        this.typ = typ;
        this.opis = opis;
        this.nr_odpadu = nr_odpadu;
    }

    public String getGrupa() {
        return grupa;
    }

    public String getPodgrupa() {
        return podgrupa;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public String getTyp() {
        return typ;
    }

    public String getOpis() {
        return opis;
    }

    public String getNr_odpadu() {
        return nr_odpadu;
    }
}
