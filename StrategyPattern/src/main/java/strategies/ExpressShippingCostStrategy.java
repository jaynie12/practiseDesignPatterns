package src.main.java.strategies;

public class ExpressShippingCostStrategy implements ShippingCostCalculator {

    public final double EXPRESS_FEE = 5.56;

    @Override
    public double calculateShippingCost(double weight, double distance) {
        double calculatedCost = weight * distance;
        return calculatedCost + EXPRESS_FEE;
    }
    
}

