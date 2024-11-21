import java.util.ArrayList;

public class Pokemon {

    String name;
    String type;

    Pokemon(String name) {
        this.name = name;
        type = "Normal";
    }

    public void attack(String name) {
        System.out.printf("%s Usou Tackle\n", name);

    }
    public static void stats(ArrayList<Pokemon> pokemons) {
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.printf("Nome:\t %s\nTipo:\t %s\n", pokemons.get(i).name, pokemons.get(i).type);
            System.out.println("--------------------");
        }
    }

}
