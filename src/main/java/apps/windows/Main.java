package apps.windows;

import architecture.io.PokeAPIPokemonAdapter;
import architecture.io.PokemonResponseDeserializer;
import architecture.io.PokemonResponseReader;
import architecture.model.Pokemon;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String read = new PokemonResponseReader().read();
        Object deserialized = new PokemonResponseDeserializer().deserialize(read);
        Pokemon pokemon = new PokeAPIPokemonAdapter().adapt(deserialized);
        System.out.println(pokemon);

    }
}
