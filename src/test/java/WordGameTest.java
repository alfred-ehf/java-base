import com.example.WordGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordGameTest {
    @Test
    void testScoreCAT() {
        WordGame wordGame = new WordGame();
        int total = wordGame.scoreWord("CAT");
        assertEquals(5, total);
    }
}
