import fubyaka3.ChangeWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChangeWord {
    @Test
    public void TestCorrect() {
        String result = ChangeWord.changeWord("I love dogs. love love love love");
        assertEquals("I *** dogs. *** *** *** ***", result);
    }
}
