package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Practice07_ProducePrices {
    public static void main(String[] args) {

        HashMap<String, Double> products= new HashMap<>();
        products.put("Iphone", 1000.0 );
        products.put("Macbook Pro", 1300.0 );
        products.put("IMac", 1500.0 );
        products.put("AirPods", 200.0);
        products.put("IPad", 700.0 );

        double maxPrice = new TreeSet<>(products.values()).last();

        for (Map.Entry<String, Double> entry : products.entrySet()){
            if(entry.getValue() == maxPrice){
                System.out.println(entry.getKey() + " is the most expensive with the price of $" + entry.getValue());
                break;
            }
        }
    }
}

