package unoGameProject;

/**
 *
 * @author Jawad
 */
public class Uno {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Game uno = Game.getInstance();

        uno.askForPlayers();

        uno.play();
    }
}