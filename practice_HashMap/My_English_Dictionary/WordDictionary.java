import java.util.HashMap;

public class WordDictionary {
    private HashMap<String, String> words = new HashMap<>();

    public void addWord(String english, String korean) {
        words.put(english, korean);
    }

    public String find(String english) {
        for (String key : words.keySet()) {
            if (key.toLowerCase().equals(english.toLowerCase())) {
                return words.get(key);
            }
        }

        return null;
    }
}