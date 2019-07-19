package main.java.movies;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cinema {

    private static List<Movies> cinema1 = Arrays.asList(
            new Movies("Captain Marvell", "fantastic", 80),
            new Movies("John Wick: Chapter 3 - Parabellum", "action", 90),
            new Movies("Green Book", "drama", 50),
            new Movies("Alita: Battle Angel", "fantastic", 60),
            new Movies("Avengers: Endgame", "fantastic", 120));
    private static List<Movies> cinema2 = Arrays.asList(
            new Movies("Bohemian Rhapsody", "biography", 50),
            new Movies("Godzilla: King of the Monsters", "action", 70),
            new Movies("Dark Phoenix", "fantastic", 80),
            new Movies("Spider-Man: Far from Home", "adventure", 100),
            new Movies("Aladdin", "fantasy", 70));

    public static Map<String, Double> printAveragePriceByGenre() {
        return Stream.concat(cinema1.stream(), cinema2.stream())
                .collect(Collectors.groupingBy(Movies::getGenre, Collectors.averagingInt(Movies::getPrice)));
    }

    public static void printMoviesByGenre(String genre) {
        int count = (int) (cinema1.stream().
                filter(Movies -> Movies.getGenre().equals(genre)).
                count() +
                cinema2.stream().
                        filter(Movies -> Movies.getGenre().equals(genre)).
                        count());
        System.out.println("* Int the two Cinemas there are: " + count + " movies in genre " + "'" + genre + "'");
    }

}


