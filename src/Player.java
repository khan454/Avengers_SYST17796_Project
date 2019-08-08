public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public boolean isHandEmpty() {
        if (this.getHand().size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Player <" + name + '>';
    }
}
