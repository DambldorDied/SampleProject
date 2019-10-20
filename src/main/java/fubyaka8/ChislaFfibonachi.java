package fubyaka8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ChislaFfibonachi {
    public static List<Integer> chisla(int a) {
        List<Integer> list = null;
        for (int i = 0; i < a; i++) {
            if(i == 0 || i == 1) {
                list.add(i);
            }
            else {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> numbers = chisla(100);
        try (FileWriter writer = new FileWriter("src\\main\\resource\\numbers.txt", false)) {
            for (int i = 0; i < numbers.size(); i++) {
                writer.write(String.valueOf(numbers.get(i)));
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
