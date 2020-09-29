package yamon.Prac7;

import java.util.*;

import static java.lang.System.out;
import static yamon.Prac7.DrunkardDeck.*;

public class Drunkard {

    private DrunkardDeck deck1;
    private DrunkardDeck deck2;
    private int round = 0;


    private Drunkard(int task) {
        out.print("Введите 5 карт первого игрока: ");
        deck1 = makeDeck(task);
        out.println("Колода первого игрока: "  + deck1);

        out.print("Введите 5 карт второго игрока: ");
        deck2 = makeDeck(task);
        out.println("Колода второго игрока: "  + deck2);
    }

    private DrunkardDeck makeDeck(int task) {
        Collection<Card> collection = getCollection(task);
        Scanner in = new Scanner(System.in);
        int[] cards = new int[5];

        for (int i = 0; i < 5; i++)
        {
            cards[5 - i - 1] = in.nextInt();
        }
        for (int i = 0; i < 5; i++)
        {
            collection.add(new Card(cards[i]));
        }
        return new DrunkardDeck(collection);
    }

    private void play() {
        out.println("\n\n        ||Игра:");
        out.println("           1-ый              2-ой");

        boolean gameOver = false;

        do {
            try{
                gameOver = nextRound();
            }
            catch (TooMuchException ex) {
                ex.printStackTrace();
                return;
            }

        } while (!gameOver);

        if (deck1.isEmpty())
            out.println("second " + round);
        else
            out.println("first " + round);
    }

    private boolean nextRound() throws TooMuchException {
       ++round;
       if (round > 106) {
           throw new TooMuchException("botva");
       }
        Card card1 = deck1.get();
        Card card2 = deck2.get();

        out.print(round + "-й раунд: ");

        if (card1.compareTo(card2) > 0) {
            out.println(card1 + " -> " + card2);
            deck1.add(card1,card2);
        }
        else {
            out.println(card1 + " <- " + card2);
            deck2.add(card1,card2);
        }

        return deck2.isEmpty() || deck1.isEmpty();
    }

    private Collection<Card> getCollection(int task) {
        if (task == 1) {
            return new Stack<>();
        }
        else {
            return new ArrayDeque<>();
        }
    }

    public static void main(String[] args) {
        out.print("Введите номер упражнения: ");
        Drunkard drunkard = new Drunkard(new Scanner(System.in).nextInt());
        drunkard.play();
    }
}

//1 5 9 3 6
//2 4 7 8 0