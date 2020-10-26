package yamon.Prac16;

public class InternetOrdersManager implements OrdersManager {

    private QueueNode head;
    private QueueNode tail;
    private int size = -1;

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size + 1];
        Iterator it = new Iterator();

        int i = 0;
        while (it.hasNext()) {
            orders[i] = it.value();
            it.next();
        }
        return orders;
    }

    private static class QueueNode {
        QueueNode next = null;
        QueueNode prev = null;
        Order value;

        public QueueNode(Order value) {
            this.value = value;
        }

        public QueueNode getNext() {
            return next;
        }

        public void setNext(QueueNode next) {
            this.next = next;
        }

        public QueueNode getPrev() {
            return prev;
        }

        public void setPrev(QueueNode prev) {
            this.prev = prev;
        }

        public Order getValue() {
            return value;
        }

        public void setValue(Order value) {
            this.value = value;
        }
    }

    class Iterator implements java.util.Iterator<QueueNode> {
        QueueNode currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode.next != null;
        }

        @Override
        public QueueNode next() {
            currentNode = currentNode.next;
            return currentNode;
        }

        public QueueNode previous() {
            currentNode = currentNode.prev;
            return currentNode;
        }

        public Order value() {
            return currentNode.value;
        }

        public QueueNode node() {
            return currentNode;
        }

        @Override
        public void remove() {
            currentNode.prev = currentNode.next;
        }
    }

    @Override
    public int itemsQuantity(String itemName) {
        Iterator it = new Iterator();

        int count = 0;
        while (it.hasNext()) {
            count += it.value().itemsQuantity(itemName);
            it.next();
        }

        return count;
    }

    @Override
    public int itemsQuantity(Item item) {
        Iterator it = new Iterator();

        int count = 0;
        while (it.hasNext()) {
            count += it.value().itemsQuantity(item);
            it.next();
        }

        return count;
    }

    @Override
    public int ordersCostSummary() {
        Iterator it = new Iterator();

        int summary = 0;
        while (it.hasNext()) {
            summary += it.value().costTotal();
            it.next();
        }

        return summary;
    }

    @Override
    public int ordersQuantity() {
        return size + 1;
    }


    public boolean add(Order order) {
        if (order == null) return false;

        if (head.value == null) {
            head.value = order;
            tail = head;
        }
        else {
            tail.next = new QueueNode(order);
            tail = tail.next;
        }

        size++;
        return true;
    }

    Order remove() {
        Order order = head.value;
        head = head.next;
        return order;
    }

    Order order() {
        return head.value;
    }
}