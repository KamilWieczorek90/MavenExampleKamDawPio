package comparowanie.comparators;

import comparowanie.Movie;

import java.util.Comparator;

public class MovieAlphabeticalComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2){
        String movieOneTitle = o1.getTitle();
        String movieTwoTitle = o2.getTitle();
        return movieOneTitle.compareTo(movieTwoTitle);
    }
}
