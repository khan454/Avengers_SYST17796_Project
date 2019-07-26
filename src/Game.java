import java.util.ArrayList;
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

        int playerCount = 1;
        while(playerCount <= numOfPlayers) {
            System.out.print("Enter name of player " + playerCount + ": ");
            players.add(new Player(input.nextLine())); // creates new player and adds to the players list
            playerCount++;
        }

        System.out.println(players);
    }

    public void play() {
        stack.createStack();
    }

    public void showWinner() {

    }
}