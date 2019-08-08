package unoGameProject;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Hasan, Jawad
 */
public class Stack {
    LinkedList<Card> deck = new LinkedList<>();

    /**
     *
     */
    public void createStack() {
        Arrays.asList(Card.Color.values()).forEach(color -> {
            Arrays.asList(Card.Value.values()).forEach(value -> {
                Card card = new Card(color, value);
                deck.add(card);
            });
        });
    }

    /**
     *
     * @return
     */
    public Card pop() { return deck.pop(); }

    /**
     *
     * @return
     */
    public Card peek() {
        return deck.peek();
    }

    /**
     *
     * @return
     */
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