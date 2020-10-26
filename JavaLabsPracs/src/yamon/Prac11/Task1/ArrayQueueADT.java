package yamon.Prac11.Task1;

import java.util.Arrays;

public class ArrayQueueADT {

    private Object[] array = new Object[10];
    private int size = -1;

    public static void enqueue(ArrayQueueADT queue, Object t) {
        assert t != null;

        ensureCapacity(queue, size(queue) + 1);
        queue.array[++queue.size] = t;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.array.length) {
            queue.array = Arrays.copyOf(queue.array, 2 * capacity);
        }
    }

    public static Object element(ArrayQueueADT queue) {
        assert size(queue) > 0;
        return queue.array[0];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert size(queue) > 0;
        Object t = queue.array[0];
        if (queue.size >= 0) System.arraycopy(queue.array, 1, queue.array, 0, queue.size);
        return t;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == -1;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size + 1;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.array = new Object[10];
    }

}
