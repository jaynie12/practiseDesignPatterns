package main;

// useful in scenarios where you want to switch between different strategies based on dynamic conditions
// in this context it is useful because people might want to switch shipping types quickly based on the cost they received. 

public class ShippingCostsContext {
    ShippingCost shippingCost;

    public ShippingCostsContext(ShippingCost shippingCost){
        this.shippingCost = shippingCost;
    }

    public void setShippingStrategy(ShippingCost shippingCost){
        this.shippingCost = shippingCost;
    }

    public void calculateCost(double weight, double distance){
        shippingCost.calculateShippingCost(weight, distance);
    }
}
