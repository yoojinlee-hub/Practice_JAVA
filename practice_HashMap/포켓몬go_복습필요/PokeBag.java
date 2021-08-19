import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();
    
    //name 이름을 갖고 있는 포켓몬을 모두 가져오는 메소드
    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        //과정 (1)에서 구현한 pokemons에 Pokemon을 넣는 메소드
        String name = pokemon.name;

         // 해당하는 ArrayList가 없으면 생성
        if (getPokemons(name) == null) {
            pokemons.put(name, new ArrayList<Pokemon>());
        }

        getPokemons(name).add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        // name 이름의 포켓몬 목록
    ArrayList<Pokemon> pokemonList = getPokemons(name);

    if (pokemonList == null) {
        return null;
    }

    // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
    Pokemon strongest = null;

    for (Pokemon pokemon : getPokemons(name)) {
        if (strongest == null || pokemon.cp > strongest.cp) {
            strongest = pokemon;
        }
    }

    return strongest;
    }

    public Pokemon getStrongest() {
       // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
    Pokemon strongest = null;

    // HashMap 전체를 탐색 (keySet을 통해 얻은 key로 탐색)
    for (String key : pokemons.keySet()) {
        // key에 해당하는 가장 센 포켓몬을 가져오기
        Pokemon p = getStrongest(key);

        // strongest를 가장 센 포켓몬으로 교체
        if (strongest == null || p.cp > strongest.cp) {
            strongest = p;
        }
    }

    return strongest;
    }
}