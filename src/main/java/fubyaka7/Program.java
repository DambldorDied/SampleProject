package fubyaka7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class Program {
    public static void main(String[] args) throws IOException {
        try(FileReader reader = new FileReader("src\\main\\resource\\numbers.txt")) {
            //BufferedReader bufferedReader = new BufferedReader(reader);
            Scanner sc = new Scanner(reader);
            int fromFile = 0;
            int sum = 0;
            int count = 0;
            while (sc.hasNextInt()) {
                fromFile = sc.nextInt();
                sum += fromFile;
                count++;
            }
            int mid = sum / count;
            System.out.println(sum + " " + count);
            //       int c = 0;
         //       while (c != -1) {
         //           c = reader.read();
         //           System.out.print((char) c);
         //       }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла. " + e.getMessage());
        }
    }
}
