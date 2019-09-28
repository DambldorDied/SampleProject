package fubyaka2;

import java.util.Scanner;

public class BackWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String text2 = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            text2 += text.charAt(i);
        }
        System.out.println(text2);
    }
}
