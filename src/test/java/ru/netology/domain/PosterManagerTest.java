package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void add() {
        PosterManager manager = new PosterManager();

        manager.addingPoster("Бладшот");
        manager.addingPoster("Вперёд");
        manager.addingPoster("Отель <<Белград>>");
        manager.addingPoster("Джентельмены");
        manager.addingPoster("Человек - невидимка");

        String[] expected = {"Бладшот", "Вперёд", "Отель <<Белград>>", "Джентельмены", "Человек - невидимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add1() {
        PosterManager manager = new PosterManager();

        manager.addingPoster("Бладшот");
        manager.addingPoster("Вперёд");
        manager.addingPoster("Отель <<Белград>>");
        manager.addingPoster("Джентельмены");
        manager.addingPoster("Человек - невидимка");
        manager.addingPoster("Тролли.Мировой тур");
        manager.addingPoster("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель <<Белград>>", "Джентельмены", "Человек - невидимка",
                "Тролли.Мировой тур", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastWithLimit() {
        PosterManager manager = new PosterManager();
        manager.addingPoster("Бладшот");
        manager.addingPoster("Вперёд");
        manager.addingPoster("Отель <<Белград>>");
        manager.addingPoster("Джентельмены");
        manager.addingPoster("Человек - невидимка");

        String[] expected = {"Человек - невидимка", "Джентельмены", "Отель <<Белград>>", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void withoutPoster() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        PosterManager manager = new PosterManager();
        manager.addingPoster("Вперёд");
        manager.addingPoster("Отель <<Белград>>");
        manager.addingPoster("Джентельмены");
        manager.addingPoster("Человек - невидимка");
        manager.addingPoster("Тролли.Мировой тур");

        String[] expected = {"Тролли.Мировой тур", "Человек - невидимка", "Джентельмены", "Отель <<Белград>>", "Вперёд"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast1() {
        PosterManager manager = new PosterManager(3);

        manager.addingPoster("Бладшот");
        manager.addingPoster("Вперёд");
        manager.addingPoster("Отель <<Белград>>");
        manager.addingPoster("Джентельмены");
        manager.addingPoster("Человек - невидимка");

        String[] expected = {"Человек - невидимка", "Джентельмены", "Отель <<Белград>>"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2() {
        PosterManager manager = new PosterManager(4);

        manager.addingPoster("Бладшот");
        manager.addingPoster("Вперёд");
        manager.addingPoster("Отель <<Белград>>");

        String[] expected = {"Отель <<Белград>>", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
