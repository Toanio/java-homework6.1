package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldStatsServiceFindSumSales() {
        int[] statsEveryMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expected = 180;

        assertEquals(expected, service.sumSales(statsEveryMonth));
    }

    @Test
    void shouldStatsServiceFindAverageSalesTest() {
        int[] statsEveryMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expected = 15;

        assertEquals(expected, service.averageAmount(statsEveryMonth));
    }

    @Test
    void shouldStatsServiceFindMaxSales() {
        int[] statsEveryMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedSales = 20;
        int expectedIndex = 8;

        assertEquals(expectedSales, service.maxSales(statsEveryMonth));
        assertEquals(expectedIndex, service.indexMaxMonth(statsEveryMonth));
    }

    @Test
    void shouldStatsServiceFindMinSales() {
        int[] statsEveryMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expectedSales = 7;
        int expectedIndex = 9;

        assertEquals(expectedSales, service.minSales(statsEveryMonth));
        assertEquals(expectedIndex, service.indexMinMonth(statsEveryMonth));
    }

    @Test
    void shouldStatsServiceFindBelowAverageSales() {
        int[] statsEveryMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expected = 5;

        assertEquals(expected, service.belowAverageSales(statsEveryMonth));
    }

    @Test
    void shouldStatsServiceFindAboveAverageSales() {
        int[] statsEveryMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expected = 5;

        assertEquals(expected, service.aboveAverageSales(statsEveryMonth));
    }

}