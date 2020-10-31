import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Word> wordList;
        String input;
        StringBuilder result = new StringBuilder();

        input = new Scanner(System.in).nextLine();
        wordList = new Sentence(input).splitWords();

        for (Word word : wordList) {
            result.append(word.shuffleLetters());
        }
        System.out.println("Исходная строка: \n" + input);
        System.out.println("Строка с перемешанными буквами: \n" + result);
    }
}
