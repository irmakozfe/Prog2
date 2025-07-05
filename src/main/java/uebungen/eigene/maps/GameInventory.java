package uebungen.eigene.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GameInventory {
    Map<String,Integer> inventory = new HashMap<>();
    // Map<K,V>

    public void addItem(String item, int quantity) {
        if(inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item)+quantity);
        }
        inventory.put(item, quantity);
    }

    public List<String> getAllItems(){
        return inventory.keySet().stream()
                .collect(Collectors.toList());
    }

    public int getTotalQuantity() {
        return inventory.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args){
        GameInventory gameInventory = new GameInventory();
        gameInventory.addItem( "Potion", 2);
        gameInventory.addItem( "Sword", 1);
        gameInventory.addItem( "Apple", 5);

        gameInventory.getAllItems().stream().forEach(k -> System.out.println(k));
        int sum= gameInventory.getTotalQuantity();

        System.out.println(sum);
    }

}
