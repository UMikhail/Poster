package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {

    ManagerFilms film1 = new ManagerFilms("Бладшот");
    ManagerFilms film2 = new ManagerFilms("Вперёд");
    ManagerFilms film3 = new ManagerFilms("Отель Белград");
    ManagerFilms film4 = new ManagerFilms("Джентельмены");
    ManagerFilms film5 = new ManagerFilms("Человек-невидимка");
    ManagerFilms film6 = new ManagerFilms("Тролли. Мировой тур");
    ManagerFilms film7 = new ManagerFilms("Номер один");


    @Test
    public void testAddFilm() {
        ManagerFilms film = new ManagerFilms();

        film.addNewFilm(film2);

        ManagerFilms[] expected = {film2};
        ManagerFilms[] actual = film.getFilmName();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        ManagerFilms films = new ManagerFilms();

        films.addNewFilm(film7);
        films.addNewFilm(film6);
        films.addNewFilm(film5);
        films.addNewFilm(film4);
        films.addNewFilm(film3);
        films.addNewFilm(film2);
        films.addNewFilm(film1);


        films.findAll();

        ManagerFilms[] expected = {film7, film6, film5, film4, film3, film2, film1};
        ManagerFilms[] actual = films.getFilmName();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimit() {
        ManagerFilms last = new ManagerFilms(5);

        last.addNewFilm(film7);
        last.addNewFilm(film6);
        last.addNewFilm(film5);
        last.addNewFilm(film4);
        last.addNewFilm(film3);
        last.addNewFilm(film2);
        last.addNewFilm(film1);

        ManagerFilms[] expected = {film1, film2, film3, film4, film5};
        ManagerFilms[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimitMin() {
        ManagerFilms last = new ManagerFilms(5);

        last.addNewFilm(film4);
        last.addNewFilm(film3);
        last.addNewFilm(film2);
        last.addNewFilm(film1);

        ManagerFilms[] expected = {film1, film2, film3, film4};
        ManagerFilms[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastDef() {
        ManagerFilms last = new ManagerFilms();

        last.addNewFilm(film7);
        last.addNewFilm(film6);
        last.addNewFilm(film5);
        last.addNewFilm(film4);
        last.addNewFilm(film3);
        last.addNewFilm(film2);
        last.addNewFilm(film1);
        last.addNewFilm(film7);
        last.addNewFilm(film6);
        last.addNewFilm(film5);
        last.addNewFilm(film4);
        last.addNewFilm(film3);
        last.addNewFilm(film2);
        last.addNewFilm(film1);

        ManagerFilms[] expected = {film1, film2, film3, film4, film5, film6, film7, film1, film2, film3};
        ManagerFilms[] actual = last.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
