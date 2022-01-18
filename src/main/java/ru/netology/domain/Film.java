package ru.netology.domain;

public class Film {
    private int idOfFilm;
    private String nameOfFilm;
    private String genreOfFilm;

    public Film(int idOfFilm, String nameOfFilm, String genreOfFilm) {
        this.idOfFilm = idOfFilm;
        this.nameOfFilm = nameOfFilm;
        this.genreOfFilm = genreOfFilm;
    }
}
