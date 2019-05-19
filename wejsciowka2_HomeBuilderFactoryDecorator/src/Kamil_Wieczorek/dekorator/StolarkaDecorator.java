package Kamil_Wieczorek.dekorator;

import Kamil_Wieczorek.Stolarka;

public abstract class StolarkaDecorator extends Stolarka {
    protected Stolarka stolarka;

    protected StolarkaDecorator(Stolarka stolarka){
        this.stolarka = stolarka;
    }
    public abstract String getDescription();
}
