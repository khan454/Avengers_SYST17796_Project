public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player <" + name + '>';
    }
}