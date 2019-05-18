package projekt2010;

public class MagazynP {

    private String nrKarty, dataD, masa, jednostka, firma, nrKlienta, nrOdpadu, nrMagazynowy;

    public MagazynP(String nrKarty, String dataD, String masa, String jednostka, String firma, String nrMagazynowy, String nrOdpadu, String nrKlienta) {
        this.nrKarty = nrKarty;
        this.dataD = dataD;
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

    public String getDataD(){
        return dataD;
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
