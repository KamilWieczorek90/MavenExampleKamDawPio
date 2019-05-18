package Kamil_Wieczorek;

public class PojazdDirector {
        public Pojazd construct(PojazdBuilder pojazdBuilder){
            return pojazdBuilder
                    .getPojazd();

        }
}
