package architecture.io;

import architecture.model.Pokemon;
import architecture.pojos.PokemonResponse;
import com.google.gson.Gson;

public class PokemonResponseDeserializer implements ResponseDeserializer{
    @Override
    public Object deserialize(String content) {
        return new Gson().fromJson(content, PokemonResponse.class);
    }
}
