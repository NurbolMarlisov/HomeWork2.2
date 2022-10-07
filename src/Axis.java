public abstract class Axis implements Printable {
Integer battle;


    public Axis(Integer battle) {
        this.battle = battle;
    }

    public Integer getBattle() {
        return battle;
    }

    public void setBattle(Integer battle) {
        this.battle = battle;
    }
}
