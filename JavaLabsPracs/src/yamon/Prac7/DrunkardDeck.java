package yamon.Prac7;

import java.util.*;

public class DrunkardDeck {

    private Collection<Card> storage;

    DrunkardDeck(Collection<Card> storage) {
        this.storage = storage;
    }

    boolean isEmpty() {
        return storage.isEmpty();
    }

    void add(Card firstPlayerCard, Card secondPlayerCard) {
        if (storage.getClass().equals(Stack.class)) {
            Stack<Card> stack = new Stack<>();
            stack.add(secondPlayerCard);
            stack.add(firstPlayerCard);
            stack.addAll(storage);
            storage = stack;
        }
        else {
            ((ArrayDeque<Card>)storage).addFirst(firstPlayerCard);
            ((ArrayDeque<Card>)storage).addFirst(secondPlayerCard);
        }
    }

    @Override
    public String toString() {
        return "DrunkardDeck{" +
                "storage=" + storage +
                '}';
    }

    Card get() {
        if (storage.getClass() == Stack.class) {
            return (Card)((Stack) storage).pop();
        }
        else {
            return (Card)((ArrayDeque) storage).pollLast();
        }
    }
}

