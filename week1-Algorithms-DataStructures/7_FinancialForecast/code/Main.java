package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static double predictFutureValue(double currentValue, int yearsAhead, double avgGrowthRate){
        if(yearsAhead <= 0) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + avgGrowthRate);
        return predictFutureValue(nextValue, yearsAhead - 1, avgGrowthRate);
    }

    static double averageGrowthRate(double[] historicalGrowthRates) {
        if (historicalGrowthRates.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double rate : historicalGrowthRates) {
            sum += rate;
        }
        return sum / historicalGrowthRates.length;
    }

    public static void main(String[] args) {
        double[] historicalGrowthRates = {0.05, 0.07, 0.04, 0.06};
        double currentValue = 1000.0;

        double avgGrowthRate = averageGrowthRate(historicalGrowthRates);
        int yearsAhead = 5;
        double futureValue = predictFutureValue(currentValue, yearsAhead, avgGrowthRate);
        System.out.printf("The predicted future value after %d years is: %.2f%n", yearsAhead, futureValue);
    }
}