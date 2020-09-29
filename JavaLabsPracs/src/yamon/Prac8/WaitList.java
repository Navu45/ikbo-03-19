package yamon.Prac8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{

    ConcurrentLinkedQueue<E> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<>();
        this.content.addAll(c);
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        E element = content.peek();
        content.remove();
        return element;
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
