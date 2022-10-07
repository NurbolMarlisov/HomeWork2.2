public class Germany extends Axis implements Printable{
    private Integer tanks;

    public Germany(Integer battle, Integer tanks) {
        super(battle);
        this.tanks = tanks;
    }

    public Integer getTanks() {
        return tanks;
    }

    public void setTanks(Integer tanks) {
        this.tanks = tanks;
    }

   // public Germany() {
    //    super();
   // }

    @Override
    public void print() {
        System.out.println(" Germany tank: "+ getTanks()+"  was battle: " + getBattle());

    }
}
