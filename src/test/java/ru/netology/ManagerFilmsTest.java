package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {
    @Test
    public void testAddFilm() {
        ManagerFilms film = new ManagerFilms();

        film.addNewFilm("film2");

        String[] expected = {"film2"};
        String[] actual = film.getFilmName();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        ManagerFilms films = new ManagerFilms();

        films.addNewFilm("film7");
        films.addNewFilm("film6");
        films.addNewFilm("film5");
        films.addNewFilm("film4");
        films.addNewFilm("film3");
        films.addNewFilm("film2");
        films.addNewFilm("film1");


        films.findAll();

        String[] expected = {"film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = films.getFilmName();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimit() {
        ManagerFilms last = new ManagerFilms(5);

        last.addNewFilm("film7");
        last.addNewFilm("film6");
        last.addNewFilm("film5");
        last.addNewFilm("film4");
        last.addNewFilm("film3");
        last.addNewFilm("film2");
        last.addNewFilm("film1");

        String[] expected = {"film1", "film2", "film3", "film4", "film5"};
        String[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimitMin() {
        ManagerFilms last = new ManagerFilms(5);

        last.addNewFilm("film4");
        last.addNewFilm("film3");
        last.addNewFilm("film2");
        last.addNewFilm("film1");

        String[] expected = {"film1", "film2", "film3", "film4"};
        String[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastDef() {
        ManagerFilms last = new ManagerFilms();

        last.addNewFilm("film7");
        last.addNewFilm("film6");
        last.addNewFilm("film5");
        last.addNewFilm("film4");
        last.addNewFilm("film3");
        last.addNewFilm("film2");
        last.addNewFilm("film1");
        last.addNewFilm("film7");
        last.addNewFilm("film6");
        last.addNewFilm("film5");
        last.addNewFilm("film4");
        last.addNewFilm("film3");
        last.addNewFilm("film2");
        last.addNewFilm("film1");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film1", "film2", "film3"};
        String[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
