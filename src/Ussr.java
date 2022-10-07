public class Ussr extends  Antanta implements Printable{
    private Integer army;

    public Ussr(Integer battle1, Integer army) {
        super(battle1);
        this.army = army;
    }

    public Integer getArmy() {
        return army;
    }

    public Ussr(Integer battle1) {
        super(battle1);
    }

    @Override
    public void print() {
        System.out.println(" Ussr wins battle of Stalingrad with "+getArmy()+" Army ");

    }
}
