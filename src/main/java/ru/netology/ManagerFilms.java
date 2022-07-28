package ru.netology;

public class ManagerFilms {
    private String filmName;

    private int limit;

    private String[] films = new String[0];

    public ManagerFilms(int limit) {
        this.limit = limit;
    }

    public ManagerFilms() {
        this.limit = 10;
    }

    public String[] getFilmName() {
        return films;
    }

    public void addNewFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (limit <= films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
