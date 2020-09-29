package yamon.Prac8;

import java.util.ArrayList;
import java.util.Collection;

public class TestWaitLists {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            collection.add(i + "l");
        }

        WaitList<String> waitList = new WaitList<>(collection);
        System.out.println(waitList.remove());

        System.out.println(waitList.toString());

        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(4);
        for (int i = 0; i < 5; i++) {
            boundedWaitList.add(i + "m");
        }

        System.out.println(boundedWaitList.toString());

        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();

        for (int i = 0; i < 5; i++) {
            unfairWaitList.add(i + "n");
        }

        unfairWaitList.moveToBack("0n");
        unfairWaitList.remove("3n");

        System.out.println(unfairWaitList.toString());

    }
}
