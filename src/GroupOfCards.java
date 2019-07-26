import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {
    ArrayList<Card> deck;

    public void shuffle() {
        Collections.shuffle(deck);
    }
}