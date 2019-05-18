package Kamil_Wieczorek;

public abstract class PomieszczenieBuilder {
    protected Pomieszczenie pomieszczenie;

    public abstract PomieszczenieBuilder buildPowierzchnia(double powierzchnia) ;
    public abstract PomieszczenieBuilder buildStolarka(Stolarka stolarka);
    public abstract Pomieszczenie build();

}
