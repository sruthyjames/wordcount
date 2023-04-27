import org.example.WordCount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class WordCountTest {
    private WordCount wrdCount;

    @BeforeEach
    void setup() {
        System.out.println("setUp()");
        wrdCount = new WordCount();
    }

    @AfterEach
    void tearDown() {
        wrdCount = null;
        System.out.println("tearDown()");
        System.out.println();
    }

    @Test
    void testWordsInSentence() {

        int countActual = wrdCount.wordCountInSen("This is a Sentences");
        Assertions.assertEquals(4, countActual);
        System.out.println("The result is "+ countActual);
    }

    @Test
    void testWordsInSentence2() {

        int countActual = wrdCount.wordCountInSen("This is a Sentences with 7 words");
        Assertions.assertEquals(7, countActual);
        System.out.println("The result is "+ countActual);
    }




}