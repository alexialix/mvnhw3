package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long totalSales = service.sumSales(sales);
        long averageSales = service.averageSales(sales);
        int maxSalesMonth = service.maxSales(sales);
        int minSalesMonth = service.minSales(sales);
        int monthsBelowAverage = service.monthsBelowAverage(sales);
        int monthsAboveAverage = service.monthsAboveAverage(sales);

        System.out.println("Сумма всех продаж: " + totalSales);
        System.out.println("Средняя сумма продаж: " + averageSales);
        System.out.println("Номер месяца с максимальными продажами: " + maxSalesMonth);
        System.out.println("Номер месяца с минимальными продажами: " + minSalesMonth);
        System.out.println("Количество месяцев с продажами ниже среднего: " + monthsBelowAverage);
        System.out.println("Количество месяцев с продажами выше среднего: " + monthsAboveAverage);
    }
}
