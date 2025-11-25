
import java.util.HashMap;
import java.util.Map;

public class class_obj {
    private Map<String, Integer> items;
    private int balance;

    // Constructor
    public class_obj() {
        items = new HashMap<>();
        items.put("chips", 20);
        items.put("chocolate", 30);
        items.put("juice", 25);
        balance = 0;
    }

    
    public void showItems() {
        System.out.println("Available Items:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    
    public void insertMoney(int amount) {
        balance += amount;
        System.out.println("Balance updated: " + balance);
    }

    
    public void buy(String itemName) {
        if (!items.containsKey(itemName)) {
            System.out.println("Item not available!");
            return;
        }

        int price = items.get(itemName);
        if (balance >= price) {
            balance -= price;
            System.out.println("Dispensing " + itemName + "...");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance! " + itemName + " costs ₹" + price);
        }
    }

    public void returnChange() {
        System.out.println("Returning change: " + balance);
        balance = 0;
    }

    
    public static void main(String[] args) {
        class_obj vm = new class_obj();
        vm.showItems();
        vm.insertMoney(50);
        vm.buy("juice");
        vm.buy("chips");
        vm.returnChange();
    }
}
