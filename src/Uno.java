public class Uno {
    public static void main(String[] args) {
        Game uno = Game.getInstance();

        uno.askForPlayers();

        uno.play();
    }
}