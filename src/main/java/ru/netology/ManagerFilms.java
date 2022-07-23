package ru.netology;
public class ManagerFilms {
    private String filmName;

    private int limit;

    private ManagerFilms[] films = new ManagerFilms[0];

    public ManagerFilms(String filmName) {
        this.filmName = filmName;
    }

    public ManagerFilms(int limit) {
        this.limit = limit;
    }

    public ManagerFilms() {
        this.limit = 10;
    }

    public ManagerFilms[] getFilmName() {
        return films;
    }

    public void addNewFilm(ManagerFilms film) {
        ManagerFilms[] tmp = new ManagerFilms[films.length + 1];
        for (int i=0; i<films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public ManagerFilms[] findAll() {
        return films;
    }

    public ManagerFilms[] findLast() {
        int resultLength;
        if (limit <= films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        ManagerFilms[] tmp = new ManagerFilms[resultLength];
        for (int i=0; i< tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
