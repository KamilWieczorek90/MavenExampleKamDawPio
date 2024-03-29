package Kamil_Wieczorek.dekorator;

import Kamil_Wieczorek.Stolarka;

public class DekoratorAntywlamaniowy extends StolarkaDecorator {

    public DekoratorAntywlamaniowy(Stolarka stolarka){
        super(stolarka);
    }
    public String getDescription(){
        return stolarka.getDescription() + " antywlamaniowe";
    }
    public double cost(){
        return 300 + stolarka.cost();
    }

}
