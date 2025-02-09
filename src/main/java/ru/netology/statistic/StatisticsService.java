package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }

    public long findMin(long[] incomes) {
        long currentMin = incomes[0];
        for (long income : incomes) {
            if (currentMin > income) {
                currentMin = income;
            }
        }
        return currentMin;
    }

    public long findAmount(long[] incomes) {
        long amount = 0;
        for (long income : incomes) {
            amount += income;
        }

        return amount;
    }

    public long averageAmount(long[] incomes) {
        long current = 0;
        for (long income : incomes) {
            current += income;

        }
        return current / incomes.length;
    }
}
