import java.util.ArrayList;
import java.util.Arrays;

public class Stack extends GroupOfCards {
    ArrayList deck = new ArrayList<Card>();

    public void createStack() {
        Arrays.asList(Card.Color.values()).forEach(color -> {
            Arrays.asList(Card.Value.values()).forEach(value -> {
                Card card = new Card(color, value);
                deck.add(card);
            });
        });

        System.out.println(deck);
        System.out.println("Deck created. ");
    }
}