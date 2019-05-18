package Kamil_Wieczorek;

import java.util.ArrayList;
import java.util.List;

public class Pomieszczenie {
    private List<Stolarka> stolarka;
    private double powierzchnia;
    private TypPomieszczenia typ;

    public Pomieszczenie(TypPomieszczenia typ) {
        this.typ = typ;
        this.stolarka = new ArrayList<>();
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }
    public void addStolarka(Stolarka stolarka){
        this.stolarka.add(stolarka);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pomieszczenie: ");
        sb.append(typ.name());
        sb.append("\r\n");
        sb.append("powierzchnia: " + powierzchnia);
        sb.append("\r\n");
        sb.append("stolarka: ");
        sb.append("\r\n");
        double suma = powierzchnia * typ.getMnoznik();
        for(Stolarka s : stolarka){
            sb.append("\t");
            sb.append(s.getDescription());
            sb.append("\r\n");
            suma+= s.cost();
        }
        sb.append("Koszt: ");
        sb.append(suma);
        return sb.toString();
    }
}
