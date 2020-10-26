package yamon.Prac16;

public class InternetOrdersManager implements OrdersManager {

    private QueueNode head;
    private QueueNode tail;
    private int size = -1;

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size + 1];
        return new Order[0];
    }

    static class QueueNode {
        QueueNode next = null;
        QueueNode prev = null;
        Order value;

        public QueueNode(Order value) {
            this.value = value;
        }
    }

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(Item item) {
        return 0;
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public Order[] ordersQuantity() {
        return new Order[0];
    }

    boolean add(Order order) {
        return false;
    }

    /*
    Order remove() {

    }

    Order order() {

    }

     */
}