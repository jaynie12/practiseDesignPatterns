package main;

public class StandardShippingCostStrategy implements ShippingCost {

    @Override
    public double calculateShippingCost(double weight, double distance) {
        double calculatedCost = weight * distance;
        return calculatedCost;
    }
    
}
