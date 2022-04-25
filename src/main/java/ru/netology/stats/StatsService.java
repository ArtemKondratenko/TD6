package ru.netology.stats;

public class StatsService {

    public int totalSales (int[] sales) {
        int sum = 0;
        for ( int sale : sales) {
            sum += sale;

        }
        return sum;
    }
    public int averageSalesAmount (int[] sales) {
        return totalSales(sales) / sales.length;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int salesBelowAverage(int[] sales) {
        int numberMonths = 0;
        int average = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale < average) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }
    public int salesAboveAverage(int[] sales) {
        int numberMonths = 0;
        int average = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale > average) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }
}
