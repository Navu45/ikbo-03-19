package yamon.Prac16_Lab16;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    Order[] getOrders();
    int ordersQuantity();
    int ordersCostSummary();
}
