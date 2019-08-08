public class Card {
    enum Color {
        RED("R"), GREEN("G"), BLUE("B"), YELLOW("Y");

        final String code;
        Color(String code) {
            this.code = code;
        }
    };

    enum Value {
        ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);

        final int code;
        Value(int code) {
            this.code = code;
        }
    };

    private Color color;
    private Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Card card = (Card) obj;

        return (card.color == this.color || card.value == this.value);
    }

    @Override
    public String toString() {
        return "[" + color.code + value.code + "]";
    }
}
