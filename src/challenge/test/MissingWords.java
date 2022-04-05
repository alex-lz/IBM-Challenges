package challenge.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MissingWords {

    public static void main(String[] args) {

        String s = "i like tomatoes really really like    it but also love oranges from oranges";
        String t = "like    oranges  ";
       
        System.out.println( missingWords(s, t));
    }

    public static List<String> missingWords(String s, String t){

        List<String> sentence = new ArrayList<>(Arrays.asList(s.split("\\s+")));
        List<String> subsequence = new ArrayList<>(Arrays.asList(t.split("\\s+")));
        
        sentence = sentence.stream().distinct().collect(Collectors.toList());

        for (String word : subsequence) {
            // sentence.removeIf(w -> w.equals(word));
            sentence.remove(word);
        }

        return sentence;
    }
    
}
