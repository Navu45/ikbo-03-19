package yamon.Prac11.Task1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static Object[] array = new Object[10];
    private static int size = -1;

    public static void enqueue(Object t) {
        assert t != null;
        if (array.length <= size + 1) {
            array = Arrays.copyOf(array, 2 * (size + 1));
        }
        array[++size] = t;
    }

    public static Object element() {
        assert size != -1;
        return array[0];
    }

    public static Object dequeue() {
        assert size != -1;
        Object t = array[0];
        if (size >= 0) System.arraycopy(array, 1, array, 0, size);
        return t;
    }

    public static boolean isEmpty() {
        return size == -1;
    }

    public static int size() {
        return size + 1;
    }

    public static void clear() {
        array = new Object[10];
    }
}
