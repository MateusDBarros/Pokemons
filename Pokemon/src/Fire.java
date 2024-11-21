public class Fire extends Pokemon{

    Fire(String name) {
        super(name);
        this.type = "Fire";
    }

    @Override
    public void attack(String name) {
        System.out.printf("%s Usou Ember\n", name);
    }

}
