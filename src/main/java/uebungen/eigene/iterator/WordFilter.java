package uebungen.eigene.iterator;

import java.util.*;

public class WordFilter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("tea");
        words.add("coffee");
        words.add("milk");
        words.add("orange juice");

        Iterator<String> iterator = words.iterator();

        while(iterator.hasNext()) {
            String word = iterator.next();  // nimmt jede Wörter
            if (word.length() <= 5){
                System.out.println(word);  // ruf das Wort auf
            }
        }

    }


}
