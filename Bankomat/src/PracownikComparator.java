package egzamin1;

import java.util.Comparator;

public class PracownikComparator implements Comparator<Pracownik> {
    @Override
    public int compare(Pracownik p1, Pracownik p2) {
        if(p1.doswiadczenie != p2.doswiadczenie) {
            return p1.doswiadczenie - p2.doswiadczenie;
        }
        if(p1.wiek != p2.wiek) {
            return p2.wiek - p1.wiek;
        }
        return p1.nazwisko.compareTo(p2.nazwisko);
    }
}
