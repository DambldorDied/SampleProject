package fubyaka2;

import java.util.Scanner;

public class Palindrom {
    public static boolean Palindrom(String text) {
        text = text.toLowerCase();
        String text2 = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            text2 += text.charAt(i);
        }
        if(text2.equals(text)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(Palindrom(text));
    }
}
