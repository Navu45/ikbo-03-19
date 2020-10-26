package yamon.Prac11.Task1;

import static yamon.Prac11.Task1.ArrayQueueModule.*;

public class ArrayQueueModuleTest {
    public static void fill() {
        for (int i = 0; i < 10; i++) {
            enqueue(i);
        }
    }

    public static void dump() {
        while (!isEmpty()) {
            System.out.println(size() + " " + element() + " " + dequeue());
        }
    }

    public static void main(String[] args) {
        fill();
        dump();
    }
}
