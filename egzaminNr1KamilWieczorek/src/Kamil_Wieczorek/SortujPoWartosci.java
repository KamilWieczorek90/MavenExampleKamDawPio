package Kamil_Wieczorek;

import java.util.Comparator;

public class SortujPoWartosci implements Comparator<Pracownik> {

        @Override
        public int compare(Pracownik p1, Pracownik p2) {
            if(p1.getDoswiadczenie() == p2.getDoswiadczenie()) {
                return p1.getDoswiadczenie() - p2.getDoswiadczenie();
            }
            if(p1.getWiek() != p2.getWiek()) {
                return p2.getWiek() - p1.getWiek();
            }
            return p1.getNazwisko().compareTo(p2.getNazwisko());
        }
    }

