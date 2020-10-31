import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public List<Word> splitWords() {
        var words = Arrays.asList(sentence.split("\\b"));

        List<Word> wordList = new ArrayList<>();

        for (String word : words) {
            wordList.add(new Word(word));
        }
        return wordList;

    }
}
