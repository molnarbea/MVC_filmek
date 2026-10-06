package Modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filmek {

    private ArrayList<Film> filmek;

    public Filmek() {
        filmek = new ArrayList<>();

        Film film1 = new Film("A remény rabjai", "Frank Darabont", 1994, 9.3, false);
        Film film2 = new Film("A Gyûrûk Ura: A király visszatér", "Peter Jackson", 2003, 9.0, false);
        Film film3 = new Film("Deadpool", "Tim Miller", 2016, 8.0, true);
        Film film4 = new Film("Interstellar", "Christopher Nolan", 2014, 8.7, false);
        Film film5 = new Film("Joker", "Todd Phillips", 2019, 8.4, true);
        Film[] filmek = {film1, film2, film3, film4, film5};
        for (Film film : filmek) {
            felvesz(film);
        }
    }

    public void felvesz(Film film) {
        filmek.add(film);
    }

    public List<Film> getFilmek() {
        return Collections.unmodifiableList(filmek);
        /*List<Film> masolat = new ArrayList<>(filmek);
        return masolat;*/
    }

}
