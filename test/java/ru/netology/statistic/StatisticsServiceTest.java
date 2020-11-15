package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.stat.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
   @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        long actual = service.findMin(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void averageAmounted() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageAmounted(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void lastElement() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 12;

        long actual = service.lastElement(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void firstElement() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 1;

        long actual = service.firstElement(purchases);

        assertEquals(expected, actual);
    }
}