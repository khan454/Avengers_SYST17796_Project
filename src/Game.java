import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
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
            try {
                numOfPlayers = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Number of players can only be a digit. 2 has been set by default.");
                numOfPlayers = 2;
            }

            if (numOfPlayers < 2 || numOfPlayers > 5) {
                System.out.println();
                System.out.println("Number of players has to be between 2 and 5.");
                System.out.print("How many players are playing this game? ");
            }
        } while(numOfPlayers < 2 || numOfPlayers > 5);

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

        dealCards(); // deal the cards to the players

        boolean cardPlayed;
        int cardIndex, playerIndex = 0;
        Scanner input = new Scanner(System.in);

        System.out.println(stack.peek());
        do {
            cardPlayed = false;
            Player currentPlayer = players.get(playerIndex);
            System.out.println();
            System.out.println(currentPlayer.getHand() + " ==> " + stack.peek());

            if (playerIndex == 0) {
                cardIndex = input.nextInt(); input.nextLine();
                System.out.println("Your card index: " + cardIndex);
            } else {
                cardIndex = currentPlayer.getHand().matchWith(stack.peek());
                System.out.println(currentPlayer.getName() + "'s card index: " + cardIndex);
            }

            cardPlayed = currentPlayer.getHand().playCardToStack(cardIndex, stack);

            if (currentPlayer.isHandEmpty()) {
                gameover = true;
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            playerIndex++;
            playerIndex %= players.size();
        } while(!gameover);
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