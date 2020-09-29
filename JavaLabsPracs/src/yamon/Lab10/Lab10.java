package yamon.Lab10;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab10<E> {
    public ArrayList<E> toArrayList(E[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection(4);

        myCollection.add(10);
        myCollection.add(15.4);
        myCollection.add("10");
        myCollection.add('t');

        System.out.println(myCollection.toString());
    }
}

class MyCollection {

    private Object[] storage;
    private int size;

    public MyCollection(int n) {
        this.storage = new Object[n];
        size = -1;
    }

    public void add(Object o) {
        storage[++size] = o;
    }

    public Object get(int index) {
        return storage[index];
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "storage=" + Arrays.toString(storage) +
                ", size=" + (size + 1) +
                '}';
    }
}
