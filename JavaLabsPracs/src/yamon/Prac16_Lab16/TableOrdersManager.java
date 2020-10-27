package yamon.Prac16_Lab16;

import java.util.ArrayList;
import java.util.Arrays;

public class TableOrdersManager implements OrdersManager{

    private Order[] orders;

    @Override
    public Order[] getOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        for (Order currentTable :
                this.orders) {
            if (currentTable != null)
                orders.add(currentTable);
        }
        return (Order[]) orders.toArray();
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (Order currentTable :
                orders) {
            for (Item item :
                    currentTable.getItems()) {
                if (item.getName().equals(itemName)) count++;
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(Item item) {
        int count = 0;
        for (Order currentTable :
                orders) {
            for (Item currentItem :
                    currentTable.getItems()) {
                if (currentItem.equals(item)) count++;
            }
        }
        return count;
    }

    @Override
    public int ordersCostSummary() {
        int summary = 0;

        for (Order currentTable :
                orders) {
            for (Item item :
                    currentTable.getItems()) {
                summary += item.getPrice();
            }
        }

        return 0;
    }

    @Override
    public int ordersQuantity() {
        int count = 0;
        for (Order currentTable :
                orders) {
            if (currentTable != null) {
                count++;
            }
        }
        return count;
    }

    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException {
        if (orders[tableNumber] != null) {
            throw new OrderAlreadyAddedException("Уже есть заказ на этот столик!");
        }
        orders[tableNumber] = order;
    }

    public void addItem(Item item, int tableNumber) {
        orders[tableNumber].add(item);
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null)
                return i;
        }
        return -1;
    }

    public int[] freeTableNumbers() {
        ArrayList<Integer> listOfTables = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null)
                listOfTables.add(i);
        }
        return Arrays.stream(listOfTables.toArray()).mapToInt(i-> (int) i).toArray();
    }

    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }

    public void remove(int tableNumber) {
        orders[tableNumber] = null;
    }

    public void remove(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                break;
            }
        }
    }

    public void removeAll(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
            }
        }
    }
}
