package yamon.Prac11.Task1;

import static yamon.Prac11.Task1.ArrayQueueADT.*;

public class ArrayQueueADTTest {
    public static void fill(ArrayQueueADT stack) {
        for (int i = 0; i < 10; i++) {
            enqueue(stack, i);
        }
    }

    public static void dump(ArrayQueueADT stack) {
        while (!isEmpty(stack)) {
            System.out.println(size(stack) + " " + element(stack) + " " + dequeue(stack));
        }
    }

    public static void main(String[] args) {
        ArrayQueueADT stack = new ArrayQueueADT();
        fill(stack);
        dump(stack);
    }
}
