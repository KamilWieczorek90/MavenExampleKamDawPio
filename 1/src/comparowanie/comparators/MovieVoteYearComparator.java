package comparowanie.comparators;

import comparowanie.Movie;

import java.util.Comparator;

public class MovieVoteYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2){
        double rating1 = o1.getRating();
        double rating2 = o2.getRating();
        int year1 = o1.getYearOfProduction();
        int year2 = o2.getYearOfProduction();

        if( rating1 < rating2){
            return 1;
        }else if (rating1 == rating2){
            if (year1 < year2){
                return 1;
            }else if (year1 == year2){
                return 0;
            }else return -1;

        }else return -1;

    }
}
