import fubyaka2.StringOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestStringOne {
    @Test
    public void TestCorrect() {
        int result = StringOne.countZnak("Сфтя! Сотку верни! Живо!!! ЪУЪ!");
        assertEquals(6, result);
    }

}
