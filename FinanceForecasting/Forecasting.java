package FinanceForecasting;

public class Forecasting {
    public double calculateFutureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return calculateFutureValue(initialAmount * (1 + growthRate), growthRate, years - 1);
    }
}
