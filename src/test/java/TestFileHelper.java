import fubyaka6.CRUD.FileHelper;
import fubyaka6.CRUD.User;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFileHelper {
    //@Test
    //public void testWriter() {
    //    Map<String, User> map = new HashMap<>();
    //    map.put("Tolya", new User("Tolya", "qwe", "dfg"));
    //    FileHelper.saveToFile("src\\main\\resource\\numbers.txt", map);
    //}
    @Test
    public void testReader() {
        Map<String, User> map = FileHelper.readFromFile("src\\main\\resource\\users");
        int result = map.size();
        assertEquals(3, result);
    }
}
