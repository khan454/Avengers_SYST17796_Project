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

    public Card pop() {
//        Card card = (Card) deck.get(0);
//        deck.remove(0);
//        return card;
        return deck.pop();
    }

    @Override
    public String toString() {
        return deck + "";
    }
}