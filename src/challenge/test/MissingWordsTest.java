package challenge.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MissingWordsTest {

    MissingWords  missingWords;

    @BeforeEach
    void setUp() {
        missingWords = new MissingWords();
    }

    @Test
    @DisplayName("Test sentence I like cheese and subsequence like")
    void simpleTest() {
        String s = "I like cheese";
        String t = "like";
        List<String> output = new ArrayList<>(Arrays.asList("I","cheese"));
        assertEquals(output, MissingWords.missingWords(s, t));
    }

    @Test
    @DisplayName("Test duplicates work")
    void duplicatesTest() {
        String s = "I like cheese but also i like tomatoes";
        String t = "like";
        List<String> output = new ArrayList<>(Arrays.asList("I","cheese","but","also", "i", "tomatoes"));
        assertEquals(output, MissingWords.missingWords(s, t));
    }

    @Test
    @DisplayName("Test multiple spaces work")
    void multispaceTest() {
        String s = "I       like      cheese";
        String t = "    like";
        List<String> output = new ArrayList<>(Arrays.asList("I","cheese"));
        assertEquals(output, MissingWords.missingWords(s, t));
    }

    @Test
    @DisplayName("Test multiple subsequence words")
    void complexTest() {
        String s = "i like tomatoes really really like    it but also love oranges from oranges";
        String t = "like    oranges  ";
        List<String> output = new ArrayList<>(Arrays.asList("i", "tomatoes", "really", "it", "but", "also", "love", "from"));
        assertEquals(output, MissingWords.missingWords(s, t));
    }

    @Test
    @DisplayName("Test case sensitive")
    void caseSensitiveTest() {
        String s = "I like cheese";
        String t = "LIKE";
        List<String> output = new ArrayList<>(Arrays.asList("I", "like", "cheese"));
        assertEquals(output, MissingWords.missingWords(s, t));
    }
    
}
