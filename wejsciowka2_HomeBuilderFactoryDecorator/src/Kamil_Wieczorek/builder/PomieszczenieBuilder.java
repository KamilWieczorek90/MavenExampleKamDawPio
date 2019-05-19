package Kamil_Wieczorek.builder;

import Kamil_Wieczorek.Stolarka;

public abstract class PomieszczenieBuilder {
    protected Pomieszczenie pomieszczenie;

    public abstract PomieszczenieBuilder buildPowierzchnia(double powierzchnia) ;
    public abstract PomieszczenieBuilder buildStolarka(Stolarka stolarka);
    public abstract Pomieszczenie build();

}
