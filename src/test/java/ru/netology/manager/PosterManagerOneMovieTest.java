package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieInfo;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerOneMovieTest {
    private PosterManager manager = new PosterManager(5);
    private MovieInfo first = new MovieInfo(1, "Номер Один", "Комедия", "url1");

    public void setUp(PosterManager manager) {
        manager.add(first);
    }

   @Test
    void getLastAdded() {

        setUp(manager);
        MovieInfo[] actual = manager.getLastAdded();
        MovieInfo[] expected = new MovieInfo[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastIfAfficheLengthIsOverLimit() {
        PosterManager manager = new PosterManager(5);
        setUp(manager);

        MovieInfo[] actual = manager.getLastAdded();
        MovieInfo[] expected = new MovieInfo[]{first};

        assertArrayEquals(expected, actual);
    }

}



