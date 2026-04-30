package src.main.java.strategies;

// useful in scenarios where you want to switch between different strategies based on dynamic conditions
// in this context it is useful because people might want to switch shipping types quickly based on the cost they received. 

public class ShippingCostsContext {
    ShippingCostCalculator shippingCost;

    public ShippingCostsContext(ShippingCostCalculator shippingCost){
        this.shippingCost = shippingCost;
    }

    public void setShippingStrategy(ShippingCostCalculator shippingCost){
        this.shippingCost = shippingCost;
    }

    public double calculateCost(double weight, double distance){
        return shippingCost.calculateShippingCost(weight, distance);
    }
}
