package projekt2010;

public class MagazynW {

    private String nrKarty, dataW, masa, jednostka, firma, nrKlienta, nrOdpadu, nrMagazynowy;

    public MagazynW(String nrKarty, String dataW, String masa, String jednostka, String firma, String nrKlienta, String nrOdpadu, String nrMagazynowy) {
        this.nrKarty = nrKarty;
        this.dataW = dataW;
        this.masa = masa;
        this.jednostka = jednostka;
        this.firma = firma;
        this.nrKlienta = nrKlienta;
        this.nrOdpadu = nrOdpadu;
        this.nrMagazynowy = nrMagazynowy;
    }

    public String getNrKarty(){
        return nrKarty;
    }

    public String getDataW(){
        return dataW;
    }

    public String getMasa(){
        return masa;
    }

    public String getJednostka(){
        return jednostka;
    }

    public String getFirma(){
        return firma;
    }

    public String getNrKlienta(){
        return nrKlienta;
    }

    public String getNrOdpadu(){
        return nrOdpadu;
    }

    public String getNrMagazynowy(){
        return nrMagazynowy;
    }
}
