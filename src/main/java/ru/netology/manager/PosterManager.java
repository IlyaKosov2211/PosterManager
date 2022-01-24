package ru.netology.manager;

import ru.netology.domain.Film;

public class PosterManager {
    private Film[] films = new Film[0];
    private int defaultLimitOfFilms = 10;

    public PosterManager() {
    }

    public PosterManager(int defaultLimitOfFilms) {
        this.defaultLimitOfFilms = defaultLimitOfFilms;
    }

    public void addFilm(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = film;
        films = tmp;
    }

    public Film[] getFilmsInReverseOrder() {
        Film[] result = new Film[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        if (result.length < defaultLimitOfFilms) {
            return result;
        } else {
            Film[] result2 = new Film[defaultLimitOfFilms];
            for (int i = 0; i < result2.length; i++) {
                result2[i] = result[i];

            }
            return result2;
        }
    }
}
