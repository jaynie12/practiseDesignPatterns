package main.strategies;

public class OverNightShippingCostStrategy implements ShippingCostCalculator {

    public final double OVERNIGHT_FEE = 4.56;

    @Override
    public double calculateShippingCost(double weight, double distance) {
        double calculatedCost = weight * distance;
        return calculatedCost + OVERNIGHT_FEE;
    }
    
}
