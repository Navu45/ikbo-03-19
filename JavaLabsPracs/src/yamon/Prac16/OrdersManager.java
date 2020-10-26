package yamon.Prac16;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    Order[] getOrders();
    Order[] ordersQuantity();
    int ordersCostSummary();
}
