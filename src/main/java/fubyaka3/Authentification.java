package fubyaka3;

import java.util.Scanner;

public class Authentification {
    public static boolean logIn(String login, String password) {
        String correctPassword = "pupil";
        String correctLogin = "pupil";
        if(login.equals(correctLogin) && password.equals(correctPassword)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = sc.next();
        String password = sc.next();
        System.out.println(logIn(login, password));
    }
}
