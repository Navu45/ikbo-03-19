package yamon.Prac16_Lab16;

public interface Order {
    boolean add(Item item);
    String[] itemsNames();
    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    Item[] getItems();
    boolean remove(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int removeAll(Item item);
    Item[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
