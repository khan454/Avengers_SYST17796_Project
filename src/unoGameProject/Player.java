package unoGameProject;

/**
 *
 * @author Hasan, Jawad
 */
public class Player {
    private String name;
    private Hand hand;

    /**
     *
     * @param name
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public Hand getHand() {
        return hand;
    }

    /**
     *
     * @return
     */
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
