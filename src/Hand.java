import java.util.ArrayList;

public class Hand {
    ArrayList<Card> deck = new ArrayList<>();

    // NEEDS REVISION

    @Override
    public String toString() {
        return deck + "";
    }

    /***
     *
     * @param card
     * @return index of the card in the deck;
     *         returns -1 if card doesn't exist
     */
    public int matchWith(Card cardOnStack) {
        for (Object cardOnHand :
                deck) {
            if (cardOnHand.equals(cardOnStack)) return deck.indexOf(cardOnHand);
        }
        return -1;
    }

    public boolean playCardToStack(int cardNumber, Stack stack) {
        int cardIndex = cardNumber - 1;
        Card card = (Card) deck.get(cardIndex);

        if (cardIndex == -1) {
            return false;
        } else {
            stack.deck.add(card);
            this.deck.remove(card);
            return true;
        }
    }

    public void add(Card card) {
        deck.add(card);
    }
}
