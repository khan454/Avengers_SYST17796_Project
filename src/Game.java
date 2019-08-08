import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    private static Game game;
    private static boolean initialized = false;

    public Game() {}

    public static Game getInstance() {
        if (initialized) return game;
        game = new Game();
        game.init();
        initialized = true;
        return game;
    }

    ArrayList<Player> players = new ArrayList<>();
    Stack stack = new Stack();
    boolean gameover = false;

    private void init() {}

    public void askForPlayers() {
        System.out.print("How many players are playing this game? ");
        Scanner input = new Scanner(System.in);

        int numOfPlayers;
        do {
            numOfPlayers = input.nextInt();
            if (numOfPlayers < 2 || numOfPlayers > 6) {
                System.out.println();
                System.out.println("Number of players has to be between 2 and 6.");
                System.out.print("How many players are playing this game? ");
            }
        } while(numOfPlayers < 2 || numOfPlayers > 6);

        System.out.println();
        input.nextLine(); // consumes the return character

        System.out.print("Enter your name: ");
        players.add(new Player(input.nextLine()));

        int playerCount = 2;
        while(playerCount <= numOfPlayers) {
            System.out.print("Enter name of player " + playerCount + ": ");
            players.add(new Player(input.nextLine())); // creates new player and adds to the players list
            playerCount++;
        }

        System.out.println(players);
    }

    public void play() {
        stack.createStack(); // create initial deck

        Collections.shuffle(stack.deck); // shuffle the deck
//        System.out.println("Stack: " + stack);

        dealCards(); // deal the cards to the players
//        System.out.println(stack.deck);

        boolean cardPlayed;
        int cardIndex, playerIndex = 0;
        Scanner input = new Scanner(System.in);

        do {
            Player currentPlayer = players.get(playerIndex);
            if (playerIndex == 0) {
                System.out.println(stack.peek());
                System.out.println(currentPlayer.getHand());

                // ask for card
                System.out.print("Pick a card by the corresponding number: ");
                cardIndex = input.nextInt();
//                System.out.println("Card Index: " + cardIndex);
            } else {
                System.out.println(stack.peek());
                System.out.println(currentPlayer.getHand());

                System.out.println("Player turn");
                input.nextLine();
                // play one of the other players
                cardIndex = currentPlayer.getHand().matchWith(stack.peek());
            }

            cardPlayed = currentPlayer.getHand().playCardToStack(cardIndex, stack);
            if (!cardPlayed) {
                currentPlayer.getHand().add(stack.tail());
            }

            // check if hand is empty
            if (currentPlayer.isHandEmpty()) {
                gameover = true;
                showWinner(currentPlayer, playerIndex);
                break;
            } else {
                playerIndex++;
                playerIndex %= players.size();
            }
        } while (!gameover);
    }

    public void showWinner(Player player, int index) {
        if (index == 0) {
            System.out.println("You won the game!");
        } else {
            System.out.println(player.getName() + " won the game!");
        }
    }

    public void dealCards() {
        for (Player player :
                players) {
            for (int i = 0; i < 7; i++) {
                player.getHand().add(stack.pop());
            }

//            System.out.println(player.getName() + ": " + player.getHand());
        }
    }
}