import java.util.*;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String shuffleLetters() {
        if(word.length()>1){
        char[] partToShuffle = word.substring(1, word.length() - 1).toCharArray();
        List<Character> characterList = new ArrayList<>();
        StringBuilder result = new StringBuilder(word);

        for (char ch : partToShuffle) {
            characterList.add(ch);
        }
        Collections.shuffle(characterList);
        for(int i =1; i<word.length()-1;i++){
            result.replace(i,i+1,characterList.get(i-1).toString());
        }
        return result.toString();
    }else
        return word;
    }
}
