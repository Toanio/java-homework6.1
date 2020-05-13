package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] statsEveryMonth) {
        int sum = 0;
        for (int oneMonth : statsEveryMonth) {
            sum += oneMonth;

        }
        return sum;

    }

    public int averageAmount(int[] statsEveryMonth) {
        StatsService service = new StatsService();
        int sum = service.sumSales(statsEveryMonth);

        return sum / statsEveryMonth.length;
    }

    public int maxSales(int[] statsEveryMonth) {
        int currentMax = statsEveryMonth[0];


        for (int oneMonth : statsEveryMonth) {


            if (currentMax < oneMonth) {
                currentMax = oneMonth;


            }
        }

        return currentMax;
    }

    public int indexMaxMonth(int[] statsEveryMonth) {
        StatsService service = new StatsService();
        int currentMax = service.maxSales(statsEveryMonth);
        int count = 0;
        int index = 0;

        for (int oneMonth : statsEveryMonth) {

            count++;

            if (currentMax == oneMonth) {

                index = count;

            }

        }
        return index;

    }

    public int minSales(int[] statsEveryMonth) {
        int currentMax = statsEveryMonth[0];


        for (int oneMonth : statsEveryMonth) {


            if (currentMax > oneMonth) {
                currentMax = oneMonth;


            }
        }

        return currentMax;
    }

    public int indexMinMonth(int[] statsEveryMonth) {
        StatsService service = new StatsService();
        int currentMax = service.minSales(statsEveryMonth);
        int count = 0;
        int index = 0;

        for (int oneMonth : statsEveryMonth) {

            count++;

            if (currentMax == oneMonth) {

                index = count;

            }

        }
        return index;

    }

    public int belowAverageSales(int[] statsEveryMonth) {
        StatsService service = new StatsService();
        int averageAmount = service.averageAmount(statsEveryMonth);

        int numberOfMonths = 0;
        for (int oneMonth : statsEveryMonth) {

            if (averageAmount < oneMonth) {
                numberOfMonths++;
            }

        }

        return numberOfMonths;
    }

    public int aboveAverageSales(int[] statsEveryMonth) {
        StatsService service = new StatsService();
        int averageAmount = service.averageAmount(statsEveryMonth);

        int numberOfMonths = 0;
        for (int oneMonth : statsEveryMonth) {

            if (averageAmount > oneMonth) {
                numberOfMonths++;
            }

        }

        return numberOfMonths;
    }

}
