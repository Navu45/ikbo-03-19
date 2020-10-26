package yamon.Prac16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TableOrder implements Order{

    private Item[] items;
    private int size = -1;
    private Customer customer;

    public TableOrder(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean add(Item item) {
        if (size + 1 >= items.length) return false;
        items[++size] = item;
        return true;
    }

    @Override
    public String[] itemsNames() {
        ArrayList<String> list = new ArrayList<>();
        for (Item item :
                items) {
            if (!list.contains(item.getName())) {
                list.add(item.getName());
            }
        }
        return list.toArray(new String[0]);
    }

    @Override
    public int itemsQuantity() {
        return size + 1;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (Item item :
                items) {
            count += item.getName().equals(itemName) ? 1 : 0;
        }
        return count;
    }

    @Override
    public int itemsQuantity(Item item) {
        int count = 0;
        for (Item currentItem :
                items) {
            count += item.equals(currentItem) ? 1 : 0;
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public boolean remove(Item item) {
        if (item == null) return false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                for (int j = i + 1; j < items.length; i++)
                {
                    items[j - 1] = items[j];
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(String itemName) {
        if (itemName == null) return false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i + 1; j < items.length; i++)
                {
                    items[j - 1] = items[j];
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        if (itemName == null) return 0;

        int countRemoved = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i + 1; j < items.length; i++)
                {
                    items[j - 1] = items[j];
                }
                countRemoved++;
            }
        }
        return countRemoved;
    }

    @Override
    public int removeAll(Item item) {
        if (item == null) return 0;

        int countRemoved = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                for (int j = i + 1; j < items.length; i++)
                {
                    items[j - 1] = items[j];
                }
                countRemoved++;
            }
        }
        return countRemoved;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        ArrayList<Item> list = new ArrayList<>(Arrays.asList(items));
        list.sort(Comparator.comparingInt(Item::getPrice));
        return list.toArray(new Item[0]);
    }

    @Override
    public int costTotal() {
        int totalCost = 0;
        for (Item item :
                items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
