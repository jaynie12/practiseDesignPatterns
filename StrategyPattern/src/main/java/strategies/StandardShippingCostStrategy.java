package src.main.java.strategies;

public class StandardShippingCostStrategy implements ShippingCostCalculator {

    @Override
    public double calculateShippingCost(double weight, double distance) {
        double calculatedCost = weight * distance;
        return calculatedCost;
    }
    
}
