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
    Player winner;
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
        } while(numOfPlayers < 2 || numOfPlayers > 6 );

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
        System.out.println(stack);

        Collections.shuffle(stack.deck); // shuffle the deck

        dealCards(); // deal the cards to the players
        System.out.println(stack.deck);
    }

    public void showWinner() {

    }

    public void dealCards() {
        for (Player player :
                players) {
//            System.out.println(player);
            for (int i = 0; i < 7; i++) {
                player.getHand().add(stack.pop());
//                System.out.println(stack.pop());
            }

            System.out.println(player.getHand());
        }
    }
}