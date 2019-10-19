package fubyaka6;

import fubyaka6.CRUD.User;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserList {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        try(FileReader reader = new FileReader("src\\main\\resource\\users")) {
            //BufferedReader bufferedReader = new BufferedReader(reader);
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()) {
                String login = sc.next();
                String password = sc.next();
                String name = sc.next();
                User user = new User(login, password, name);
                userList.add(user);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла. " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.err.println("Неверный формат данных " + e.getMessage());
        }
        for (User x : userList) {
            System.out.println(x);
        }
    }
}
