package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.stat.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    private  int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private  StatisticsService service = new StatisticsService();
   @Test
    void calculateSum() {


        assertEquals(180, service.calculateSum(purchases));
    }

    @Test
    void findMax() {


        assertEquals(8, service.findMax(purchases));
    }

    @Test
    void findMin() {

        assertEquals(9, service.findMin(purchases));
    }

    @Test
    void average() {

           assertEquals(15, service.average(purchases));
    }

    @Test
    void lessThanAverage() {

        assertEquals(5, service.lessThanAverage(purchases));
    }

    @Test
    void moreThanAverage() {

      assertEquals(5, service.moreThanAverage(purchases));
    }
}