package fubyaka6.CRUD;

import fubyaka6.CRUD.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileHelper {
    public static Map<String, User> readFromFile(String path) {
        Map<String, User> map = new HashMap<>();
        try(FileReader reader = new FileReader(path)) {
            //BufferedReader bufferedReader = new BufferedReader(reader);
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()) {
                String login = sc.next();
                String password = sc.next();
                String name = sc.next();
                User user = new User(login, password, name);
                map.put(login, user);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла. " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.err.println("Неверный формат данных " + e.getMessage());
        }
        return map;
    }
    public static void saveToFile(String path, Map<String,User> users) {
        try (FileWriter writer = new FileWriter(path, false)) {
            //for (Map.Entry<String, User> pair : users.entrySet()) {
            //    User userToWrite = pair.getValue();
            //    writer.write(userToWrite.getLogin() + " " + userToWrite.getPassword() + " " + userToWrite.getName());
            //    writer.write("\n");
            //}
            for (User x : users.values()) {
                String login = x.getLogin() + " " + x.getPassword() + " " + x.getName();
                writer.write(login + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
