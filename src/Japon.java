public class Japon extends Axis implements Printable{
    private Integer fleet;

    public Japon(Integer battle) {
        super(battle);
    }

    public Integer getFleet() {
        return fleet;
    }

    public void setFleet(Integer fleet) {
        this.fleet = fleet;
    }

    public Japon(Integer battle, Integer fleet) {
        super(battle);
        this.fleet = fleet;
    }

    @Override
    public void print() {
        System.out.println(" Japon Fleet: "+ getFleet()+ " was battle "+ getBattle());

    }
}
