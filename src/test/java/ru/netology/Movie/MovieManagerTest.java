package ru.netology.Movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void input() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void inputEmpty() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void inputOne() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film II");

        String[] expected = {"Film II"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void output() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}