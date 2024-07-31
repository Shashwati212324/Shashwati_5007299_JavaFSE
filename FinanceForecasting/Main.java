package FinanceForecasting;

public class Main {
    public static void main(String[] args) {
        Forecasting forecasting = new Forecasting();

        double initialAmount = 1000.0;
        double growthRate = 0.05;
        int years = 10;

        double futureValue = forecasting.calculateFutureValue(initialAmount, growthRate, years);

        System.out.println("The future value of an investment of $" + initialAmount +
                " with an annual growth rate of " + (growthRate * 100) +
                "% over " + years + " years is $" + String.format("%.2f", futureValue));
    }
}

