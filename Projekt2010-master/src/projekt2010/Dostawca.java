package projekt2010;

public class Dostawca {

    String nazwa, miejscowosc, ulica, nrKlienta;

    public Dostawca(String nazwa, String miejscowosc, String ulica, String nrKlienta){
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrKlienta = nrKlienta;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public String getNrKlienta() {
        return nrKlienta;
    }

//    public void setNazwa(String nazwa) {
//        this.nazwa = nazwa;
//    }
//
//    public void setMiejscowosc(String miejscowosc) {
//        this.miejscowosc = miejscowosc;
//    }
//
//    public void setUlica(String ulica) {
//        this.ulica = ulica;
//    }
//
//    public void setNrKlienta(String nrKlienta) {
//        this.nrKlienta = nrKlienta;
//    }
}
