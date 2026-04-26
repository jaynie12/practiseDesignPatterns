package main.strategies;

public interface ShippingCostCalculator {
    double calculateShippingCost(double weight, double distance);
    
}