package yamon.Prac7;

class Card implements Comparable<Card>{
    private int number;

    private int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card card) {
        if (number < card.getNumber() && number != 0) return -1;
        else if (number > card.getNumber() && card.getNumber() != 0) return 1;
        else if (number == 0) return 1;
        else if (card.getNumber() == 0) return -1;
        else return 0;
    }

    Card(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                '}';
    }
}
