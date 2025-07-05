package uebungen.eigene.maps;

import java.util.*;

public class Restaurant {
    public static void main(String[] args){
        Map<String, List<String>> orders = new HashMap<>();

        orders.put("Anna", new ArrayList<>(List.of("Pizza", "Cola")));
        orders.put("Bob", new ArrayList<>(List.of("Ice")));
        orders.put("Carlos", new ArrayList<>(List.of("Cake")));

        orders.get("Anna").add("Tiramisu");

        for(Map.Entry<String, List<String>> entry : orders.entrySet()){
            String customer = entry.getKey();
            List<String> order = entry.getValue();
            System.out.println(customer + ", " + order);
        }




    }
}
