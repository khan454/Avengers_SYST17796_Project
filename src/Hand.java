import java.util.ArrayList;

public class Hand {
    ArrayList<Card> deck = new ArrayList<>();

    // NEEDS REVISION

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

//        for (Object cardOnHand :
//                deck) {
//            if (cardOnHand.equals(cardOnStack)) {
//                System.out.println(cardOnHand + " matches with " + cardOnStack);
//                return deck.indexOf(cardOnHand) + 1;
//            }
//        }
//        return -1;
    }

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
            }
        }
        return true;
//
//        try {
//            Card card = (Card) deck.get(cardNumber - 1);
//            if (card.equals(stack.peek())) {
//                stack.deck.add(0, card);
//                this.deck.remove(cardNumber - 1);
//
//                System.out.println(card + " was played");
////                return true;
//            }
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("No card played");
//            return false;
//        }
//
//        return true;
        // * * *
//        try {
//            Card card = (Card) deck.get(cardIndex);
//            if (!card.equals(stack.peek())) {
//                return false;
//            } else {
//                stack.deck.add(0, card);
//                this.deck.remove(card);
//                return true;
//            }
//        } catch(IndexOutOfBoundsException e) {
//            // add card to hand
//            return false;
//        }
    }

    public int size() {
        return this.deck.size();
    }

    public void add(Card card) {
        deck.add(card);
    }
}
