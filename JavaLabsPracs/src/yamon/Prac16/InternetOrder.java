package yamon.Prac16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class InternetOrder implements Order{

    private int size = -1;
    private ListNode head = new ListNode();
    private ListNode tail = null;
    private Customer customer;

    static class ListNode {
        ListNode next;
        Item value;

        public ListNode(Item value) {
            this.value = value;
        }

        public ListNode() {
            this.next = null;
            this.value = null;
        }
    }

    class Iterator implements java.util.Iterator<ListNode> {
        ListNode currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode.next != null;
        }

        @Override
        public ListNode next() {
            currentNode = currentNode.next;
            return currentNode;
        }

        public Item value() {
            return currentNode.value;
        }

        public ListNode node() {
            return currentNode;
        }

        public void remove(ListNode prev) {
            prev.next = currentNode.next;
        }
    }

    public InternetOrder(Item[] items, Customer customer) {
        for (Item item :
                items) {
            add(item);
        }
    }

    public InternetOrder(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean add(Item item) {
        if (item == null) return false;

        if (head.value == null) {
            head.value = item;
            tail = head;
        }
        else {
            tail.next = new ListNode(item);
            tail = tail.next;
        }

        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Iterator it = new Iterator();

        while (it.hasNext()) {
            int hashCode = it.value().hashCode();
            String name = it.value().getName();
            hashMap.put(hashCode, name);
            it.next();
        }

        return hashMap.values().toArray(new String[0]);
    }

    @Override
    public int itemsQuantity() {
        return size + 1;
    }

    @Override
    public int itemsQuantity(String itemName) {
        Iterator it = new Iterator();
        int count = 0;

        while (it.hasNext()) {
            if (it.value().getName().equals(itemName)) {
                count++;
            }
            it.next();
        }
        return count;
    }

    @Override
    public int itemsQuantity(Item item) {
        Iterator it = new Iterator();
        int count = 0;

        while (it.hasNext()) {
            if (it.value().equals(item)) {
                count++;
            }
            it.next();
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        ArrayList<Item> list = new ArrayList<>();
        Iterator it = new Iterator();

        while (it.hasNext()) {
            list.add(it.value());
            it.next();
        }
        return list.toArray(new Item[0]);
    }

    @Override
    public boolean remove(Item item) {
        if (head == null) return false;

        Iterator it = new Iterator();
        ListNode prev = it.node();

        while (it.hasNext()) {
            if (it.value().equals(item)) {
                it.remove(prev);
                return true;
            }
            prev = it.next();
        }
        return false;
    }

    @Override
    public boolean remove(String itemName) {
        if (head == null) return false;

        Iterator it = new Iterator();
        ListNode prev = it.node();

        while (it.hasNext()) {
            if (it.value().getName().equals(itemName)) {
                it.remove(prev);
                return true;
            }
            prev = it.next();
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        if (head == null) return 0;

        Iterator it = new Iterator();
        ListNode prev = it.node();

        int countRemoved = 0;
        while (it.hasNext()) {
            if (it.value().getName().equals(itemName)) {
                it.remove(prev);
                countRemoved++;
            }
            prev = it.next();
        }
        return countRemoved;
    }

    @Override
    public int removeAll(Item item) {
        if (head == null) return 0;

        Iterator it = new Iterator();
        ListNode prev = it.node();

        int countRemoved = 0;
        while (it.hasNext()) {
            if (it.value().equals(item)) {
                it.remove(prev);
                countRemoved++;
            }
            prev = it.next();
        }
        return countRemoved;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        ArrayList<Item> list = new ArrayList<>(size + 1);
        list.add(head.value);
        Iterator it = new Iterator();
        while (it.hasNext()) {
            list.add(it.next().value);
        }
        list.sort(Comparator.comparingInt(Item::getPrice));
        return list.toArray(new Item[0]);
    }

    @Override
    public int costTotal() {
        Iterator it = new Iterator();
        int totalCost = 0;
        while (it.hasNext()) {
            totalCost += it.next().value.getPrice();
        }
        return 0;
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