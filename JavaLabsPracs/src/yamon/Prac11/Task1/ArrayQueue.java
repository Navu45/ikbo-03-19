package yamon.Prac11.Task1;

/*
n >= 0
для любого i = 1...n : [i] != null
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayQueue {

    private Object[] array = new Object[10];
    private int size = -1;

    public void enqueue(Object t) {
        assert t != null;
        if (array.length <= size + 1) {
            array = Arrays.copyOf(array, 2 * (size + 1));
        }
        array[++size] = t;
    }

    public Object element() {
        assert size() > 0;
        return array[0];
    }

    public Object dequeue() {
        assert size() > 0;
        Object t = array[0];
        if (size >= 0) System.arraycopy(array, 1, array, 0, size);
        return t;
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public int size() {
        return size + 1;
    }

    public void clear() {
        array = new Object[10];
    }
}
