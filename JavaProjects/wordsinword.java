import java.util.HashSet;
import java.util.Set;

public class wordsinword {
    public static Set<String> wordswithinword(String word){
        word = word.toLowerCase();
        Set<String> wordList = new HashSet<>();

        for(int length = 3; length <= word.length(); length++){
            for(int i = 0; i <= word.length() - length; i++){
                String subWord = word.substring(i, i + length);
                if(!subWord.equals(word)){
                    wordList.add(subWord);
                }
            }
        }

        return wordList;
    }  

public static void main(String[] args) {
    String inputWord = "mistake";
    Set<String> result = wordsWithinWord(inputWord);
    System.out.println(result);
    }
}

