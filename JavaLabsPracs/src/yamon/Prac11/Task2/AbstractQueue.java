package yamon.Prac11.Task2;

abstract public class AbstractQueue {
    protected int size = -1;

    public boolean isEmpty() {
        return size == -1;
    }

    public int size() {
        return size + 1;
    }
}
