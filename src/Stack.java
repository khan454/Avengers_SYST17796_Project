import java.util.Arrays;
import java.util.LinkedList;

public class Stack {
    LinkedList<Card> deck = new LinkedList<>();

    public void createStack() {
        Arrays.asList(Card.Color.values()).forEach(color -> {
            Arrays.asList(Card.Value.values()).forEach(value -> {
                Card card = new Card(color, value);
                deck.add(card);
            });
        });
    }

    public Card pop() { return deck.pop(); }

    public Card peek() {
        return deck.peek();
    }

    public Card tail() {
        int index = deck.size() - 1;
        Card card = deck.get(index);
        deck.remove(index);
        return card;
    }

    @Override
    public String toString() {
        return deck + "";
    }
}