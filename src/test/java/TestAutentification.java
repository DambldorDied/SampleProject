import fubyaka2.StringOne;
import fubyaka3.Authentification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAutentification {
    @Test
    public void testCorrect() {
        boolean result = Authentification.logIn("pupil", "pupil");
        assertEquals(true, result);
    }

    @Test
    public void testInCorrect() {
        boolean result = Authentification.logIn("pul", "pupil");
        assertEquals(false, result);
    }
}
