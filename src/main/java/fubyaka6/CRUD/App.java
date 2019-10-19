package fubyaka6.CRUD;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserService serv = new UserService();
        int key = -1;
        Scanner sc = new Scanner(System.in);
        while (key != 0) {
            System.out.println("1. Добавить пользователя");
            System.out.println("2. Удалить пользователя");
            System.out.println("3. Редактирвать пользователя");
            System.out.println("4. Показать список пользователей");
            System.out.println("5. Показать пользователя по логину");
            System.out.println("0. Выйти");
            key = sc.nextInt();
            switch (key) {
                case 0:
                {
                    System.exit(0);
                }
                case 1:
                {
                    System.out.print("Логин: ");
                    String login = sc.next();
                    System.out.print("Пароль: ");
                    String password = sc.next();
                    System.out.print("Имя: ");
                    String name = sc.nextLine();
                    User user = new User(login, password, name);
                    serv.addUsers(user);
                    break;
                }
                case 2:
                {
                    System.out.print("Введите логин: ");
                    String login = sc.next();
                    serv.deleteByLogin(login);
                    break;
                }
                case 3:
                {
                    System.out.print("Логин: ");
                    String login = sc.next();
                    System.out.print("Пароль: ");
                    String password = sc.next();
                    System.out.print("Имя: ");
                    String name = sc.nextLine();
                    User user = new User(login, password, name);
                    serv.editUser(user);
                    break;
                }
                case 4:
                {
                    List<User> users = serv.getAllUsers();
                    for (int i = 0; i < users.size(); i++) {
                        System.out.println("Логин: " + users.get(i).getLogin() + "Пароль: " + users.get(i).getPassword() + "Имя: " + users.get(i).getName());
                    }
                    break;
                }
                case 5:
                    System.out.print("Логин: ");
                    String login = sc.next();
                    User user = serv.getByLogin(login);
                    System.out.println("Логин: " + user.getLogin() + "Пароль: " + user.getPassword() + "Имя: " + user.getName());
                    break;
            }
        }
    }
}
