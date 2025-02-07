import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Restaurant {
    private int numberOfTables;
    private Map<Integer, Order> tableOrders;

    @Autowired
    private MenuItemRepository menuItemRepository;

    public Restaurant(int numberOfTables) {
        this.numberOfTables = numberOfTables;
        this.tableOrders = new HashMap<>();
        for (int i = 1; i <= numberOfTables; i++) {
            tableOrders.put(i, new Order());
        }
    }

    public Order getOrderForTable(int tableNumber) {
        return tableOrders.getOrDefault(tableNumber, null);
    }

    public void addMenuItemsToDatabase() {
        // Здесь можно добавить данные в базу данных.
        menuItemRepository.save(new MenuItem("Пицца", 500));
        menuItemRepository.save(new MenuItem("Салат", 300));
    }

    public void printAllReceipts() {
        // Печать всех чеков
        for (int table : tableOrders.keySet()) {
            System.out.println("Стол " + table + " Чек:");
            tableOrders.get(table).printReceipt();
            System.out.println("--------------------");
        }
    }
}