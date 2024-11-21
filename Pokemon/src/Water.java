public class Water extends Pokemon{

    Water(String name) {
        super(name);
        this.type = "Water";
    }
    @Override
    public void attack(String name) {
        System.out.printf("%s Usou Water Gun\n", name);
    }
}
