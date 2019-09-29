import fubyaka3.Massive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestMidArr {
    @Test
    public void testCorrect() {
        int[] mas = new int[2];
        mas[0] = 2;
        mas[1] = 4;
        double result = Massive.countMidAr(mas);
        assertEquals(3, result);
        mas[0] = -10;
        mas[1] = 10;
        result = Massive.countMidAr(mas);
        assertEquals(0, result);
    }
}
