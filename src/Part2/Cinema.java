package Part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cinema {
    HashMap<Integer, LinkedList<Film>> films = new HashMap<>();

    public void addFilm(Film film) {
        LinkedList<Film> filmsByYear = this.films.get(film.getYear());
        if(filmsByYear == null) {
            filmsByYear = new LinkedList<>();
            filmsByYear.add(film);
            films.put(film.getYear(), filmsByYear);
        } else {
            if(!filmsByYear.contains(film)) {
                filmsByYear.add(film);
            }
        }
    }

    public List<Film> getFilmsByYear(int year) {
        LinkedList<Film> filmsByYear = this.films.get(year);
        return new ArrayList<>(filmsByYear);
    }

    public List<Film> getFilmsByYearAndMonth(int year, int month) {
        List<Film> filmsByYear = this.films.get(year);
        return filmsByYear.stream().filter(it -> it.getMonth() == month).collect(Collectors.toList());
    }

    public List<Film> getFilmsBGenre(String genre) {
        return films.values().stream()
                .flatMap(Collection::stream)
                .filter(it -> Objects.equals(it.getGenre(), genre)).collect(Collectors.toList());
    }

    public List<Film> getTopFilms(int top) {
        return films.values().stream()
                .flatMap(Collection::stream)
                .sorted((o1, o2) -> (int) (100 * (-o1.getRating() + o2.getRating())))
                .limit(top).collect(Collectors.toList());
    }


}
