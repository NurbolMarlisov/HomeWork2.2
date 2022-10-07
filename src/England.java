public class England extends Antanta implements Printable{
    private int fighter;

    public int getFighter() {
        return fighter;
    }

    public England(Integer battle1, int fighter) {
        super(battle1);
        this.fighter = fighter;
    }

    public England(Integer battle1) {
        super(battle1);
    }

    @Override
    public void print() {
        System.out.println("England prepared: " + getBattle1() +" " +
                "Fleet end " + getFighter()+" Fighters ");

    }
}
