package comparowanie;

import comparowanie.comparators.MovieAlphabeticalComparator;
import comparowanie.comparators.MovieVoteYearComparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Movie> movies = new ArrayList<>();

        Path pathToFile = Paths.get("/projekty/movie.csv");
        BufferedReader bufferedReader = Files.newBufferedReader(pathToFile, Charset.forName("UTF-8"));
       // String oneLine = bufferedReader.readLine();
        String oneLine = "";

        while (oneLine != null) {
            oneLine = bufferedReader.readLine();
            if (oneLine != null){
                movies.add(getMovieFromCsvString(oneLine));
            }

            //System.out.println(oneLine);
        }
       // Collections.sort(movies);
       // for (Movie movie:movies){
       //     System.out.println(movie);
       //  }
       // Collections.sort(movies, new MovieAlphabeticalComparator());
        //for (Movie movie:movies){
         //        System.out.println(movie);
         //     }
        Collections.sort(movies, new MovieVoteYearComparator());
        System.out.println(movies);

    }

    public static Movie getMovieFromCsvString(String csvString){
        String[] splitResult = csvString.split(";");

        return new Movie(
                splitResult[2],
                Integer.valueOf(splitResult[3]),
                Double.valueOf(splitResult[4]),
                Long.valueOf(splitResult[5]),
                Double.valueOf(splitResult[6])
        );
    }
}
