package Kamil_Wieczorek;

public class PracownikFactory {
    public static Pracownik getPracownik(PracownikAbstractFactory factory){
        return factory.createPracownik();
    }
}
