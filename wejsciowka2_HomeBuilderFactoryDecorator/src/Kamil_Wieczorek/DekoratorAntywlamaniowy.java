package Kamil_Wieczorek;

public class DekoratorAntywlamaniowy extends StolarkaDecorator{

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
