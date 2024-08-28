package ru.netology.stats;
public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long i : sales) {
            sum += (int) i;
        }
        return sum;
    }

    public int averageSalesInMonth(long[] sales) {
        int average = sumSales(sales) / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minMonth(long[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageSalesInMonth(sales)) {
                minSales++;
            }
        }
        return minSales;
    }

    public int maxMonth(long[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageSalesInMonth(sales)) {
                maxSales++;
            }
        }
        return maxSales;
    }
}

