package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    PosterManager manager = new PosterManager();
    private Film first = new Film(1, "Бладшот", "боевик");
    private Film second = new Film(2, "Вперед", "мультфильм");
    private Film third = new Film(3, "Отель Белград", "комедия");
    private Film fourth = new Film(4, "Джентельмены", "боевик");
    private Film fifth = new Film(5, "человек- невидимка", "ужасы");
    private Film sixth = new Film(6, "Тролли. Мировой тур", "мультфильм");
    private Film seventh = new Film(7, "Номер один", "комедия");
    private Film eighth = new Film(8, "Титаник", "драма");
    private Film ninth = new Film(9, "Терминатор", "боевик");
    private Film tenth = new Film(10, "Аватар", "фантастика");

    @Test
    void showLimitOfFilms() {
        PosterManager manager = new PosterManager(10);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] actual = manager.getFilmsInReverseOrder();
        assertArrayEquals(expected, actual);
    }

    @Test
    void showOverLimit() {
        PosterManager manager = new PosterManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] actual = manager.getFilmsInReverseOrder();
        assertArrayEquals(expected, actual);
    }

    @Test
    void showBelowTheLimit() {
        PosterManager manager = new PosterManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        Film[] expected = {fifth, fourth, third, second, first};
        Film[] actual = manager.getFilmsInReverseOrder();
        assertArrayEquals(expected, actual);
    }
}