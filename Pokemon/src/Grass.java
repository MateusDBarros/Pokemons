public class Grass extends Pokemon{
    Grass(String name) {
        super(name);
        this.type = "Grass";
    }
    @Override
    public void attack(String name) {
        System.out.printf("%s Usou Razor Leaf\n", name);
    }
}
