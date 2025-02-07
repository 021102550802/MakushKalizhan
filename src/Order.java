import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;
    private double discount;
    private double tips;

    public Order() {
        this.items = new ArrayList<>();
        this.discount = 0;
        this.tips = 0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    public void addTips(double tips) {
        this.tips = tips;
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        total -= discount;
        total += tips;
        return total;
    }

    public void printReceipt() {
        System.out.println("Чек:");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - " + item.getPrice() + " KZT");
        }
        System.out.println("Скидка: " + discount + " KZT");
        System.out.println("Чаевые: " + tips + " KZT");
        System.out.println("Итого: " + calculateTotal() + " KZT");
    }
}