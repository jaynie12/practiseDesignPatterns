package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import main.strategies.ExpressShippingCostStrategy;
import main.strategies.OverNightShippingCostStrategy;
import main.strategies.ShippingCostCalculator;
import main.strategies.StandardShippingCostStrategy;

public class ShippingInfoValidator {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static ShippingCostCalculator shippingCost;
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the weight of your parcel in KG");
        double weight = Integer.parseInt(reader.readLine());
        System.out.print("Enter the distance of the parcel");
        double distance = Integer.parseInt(reader.readLine());
        System.out.print("Please, select a shipping type:" + "\n" +
                        "1 - Standard" + "\n" +
                        "2 - Express" + "\n" +
                        "3 - Overnight" + "\n" );
        int shippingChoice = Integer.parseInt(reader.readLine());
        shippingCost = switch (shippingChoice) {
            case (1) -> new StandardShippingCostStrategy();
            case (2) -> new ExpressShippingCostStrategy();
            default -> new OverNightShippingCostStrategy();
        };
    }
}
