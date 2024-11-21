import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        Fire charmander = new Fire("Charmander");
        charmander.attack(charmander.name);
        pokemons.add(charmander);

        Grass bulbasaur = new Grass("Bulbasaur");
        bulbasaur.attack(bulbasaur.name);
        pokemons.add(bulbasaur);

        Water squirtle = new Water("Squirtle");
        squirtle.attack(squirtle.name);
        pokemons.add(squirtle);

        Pokemon rattata = new Pokemon("Rattata");
        rattata.attack(rattata.name);
        pokemons.add(rattata);

        System.out.println();
        Pokemon.stats(pokemons);

    }

}