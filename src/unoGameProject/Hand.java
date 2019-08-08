package unoGameProject;

import java.util.ArrayList;

/**
 *
 * @author Hasan, Jawad
 */
public class Hand {
    ArrayList<Card> deck = new ArrayList<>();

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size(); i++) {
            output += "  ";
            output += (i + 1);
            output += "  ,";
        }
        output += " \n";
        return output + deck;
    }

    /**
     *
     * @param cardOnStack
     * @return
     */
    public int matchWith(Card cardOnStack) {
        int index = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).equals(cardOnStack)) {
                System.out.println(deck.get(i) + " matches with " + cardOnStack);
                index = i + 1;
                break;
            }
        }
        return index;
    }

    /**
     *
     * @param cardNumber
     * @param stack
     * @return
     */
    public boolean playCardToStack(int cardNumber, Stack stack) {
        if (cardNumber < 1 || cardNumber > deck.size()) {
            Card newCard = stack.tail();
            deck.add(0, newCard);
            System.out.println("No card played. " + newCard + " was picked from stack.");
            return false;
        } else {
            Card card = (Card) deck.get(cardNumber - 1);
            if (card.equals(stack.peek())) {
                stack.deck.add(0, card);
                this.deck.remove(cardNumber - 1);

                System.out.println(card + " was played");
            } else {
                Card newCard = stack.tail();
                deck.add(0, newCard);
                System.out.println("No card played. " + newCard + " was picked from stack.");
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return
     */
    public int size() {
        return this.deck.size();
    }

    /**
     *
     * @param card
     */
    public void add(Card card) {
        deck.add(card);
    }
}
