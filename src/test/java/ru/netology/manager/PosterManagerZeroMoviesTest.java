package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieInfo;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerZeroMoviesTest {
    private PosterManager manager = new PosterManager();

    @Test
    void getLastAdded() {
        MovieInfo[] actual = manager.getLastAdded();
        MovieInfo[] expected = new MovieInfo[]{};

        assertArrayEquals(expected, actual);
    }

}


