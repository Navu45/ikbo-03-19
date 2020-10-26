package yamon.Prac11.Task2;

public interface Queue {
    void enqueue(Object t);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
