package Part2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        fillFilms(films);
        Cinema cinema = new Cinema();
        addFilms(cinema, films);

        System.out.println(cinema.getTopFilms(5));
        System.out.println();
        System.out.println(cinema.getFilmsByYearAndMonth(2000,4));
        System.out.println();
        System.out.println(cinema.getFilmsBGenre("drama"));
        System.out.println();
        System.out.println(cinema.getFilmsByYear(2001));

        
    }

    private static void fillFilms(List<Film> films) {
        films.add(new Film(1, 2000, 1, "Comedy", 8.1));
        films.add(new Film(2, 2000, 2, "Comedy", 8.2));
        films.add(new Film(3, 2000, 3, "Comedy", 8.3));
        films.add(new Film(4, 2000, 4, "Comedy", 8.4));
        films.add(new Film(5, 2000, 1, "Comedy", 8.5));
        films.add(new Film(6, 2000, 1, "Comedy", 8.6));
        films.add(new Film(7, 2000, 4, "drama", 8.7));
        films.add(new Film(8, 2000, 1, "Comedy", 8.8));
        films.add(new Film(9, 2001, 1, "drama", 8.9));
        films.add(new Film(10, 2001, 1, "Comedy", 8.95));
    }

    private static void addFilms(Cinema cinema, List<Film> films) {
        for (Film film: films
             ) {
            cinema.addFilm(film);
        }
    }
}
