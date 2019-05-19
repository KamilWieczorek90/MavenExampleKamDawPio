package Kamil_Wieczorek.builder;

import Kamil_Wieczorek.Stolarka;

public class KuchniaBuilder extends PomieszczenieBuilder {

    public KuchniaBuilder() {
        pomieszczenie = new Pomieszczenie(TypPomieszczenia.KUCHNIA);
    }
    public KuchniaBuilder buildPowierzchnia(double powierzchnia) {
        pomieszczenie.setPowierzchnia(powierzchnia);
        return this;
    }
    public KuchniaBuilder buildStolarka(Stolarka stolarka){
        pomieszczenie.addStolarka(stolarka);
        return this;
    }
    public Pomieszczenie build(){
        return pomieszczenie;
    }


    @Override
    public String toString() {
        return "KuchniaBuilder{" +
                "kuchnia="  +
                ", pomieszczenie=" + pomieszczenie +
                '}';
    }
}

