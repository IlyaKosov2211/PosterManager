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
        int filmsLine = films.length;
        if (filmsLine < defaultLimitOfFilms) {
            defaultLimitOfFilms = filmsLine;
        }
        Film[] addedFilm = new Film[defaultLimitOfFilms];
        for (int i = 0; i < addedFilm.length; i++) {
            int result = filmsLine - i - 1;
            addedFilm[i] = films[result];

        }
        return addedFilm;
    }
}
