public class Italy extends Axis implements Printable{
    private Integer aircraft;

    public Italy(Integer battle, Integer aircraft) {
        super(battle);
        this.aircraft = aircraft;
    }

    public Integer getAircraft() {
        return aircraft;
    }

    public void setAircraft(Integer aircraft) {
        this.aircraft = aircraft;
    }

    public Italy(Integer battle) {
        super(battle);
    }

    @Override
    public void print() {
        System.out.println(" Italy aircraft: " + getAircraft() +" was battle: " + getBattle());

    }
}
