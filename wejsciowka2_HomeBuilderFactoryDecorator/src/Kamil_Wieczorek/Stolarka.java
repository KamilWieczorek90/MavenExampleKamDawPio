package Kamil_Wieczorek;

public abstract class Stolarka {
    String description = "Nieznane okno albo drzwi";
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
