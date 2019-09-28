package fubyaka2;

import java.util.Scanner;

public class StringOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '!') {
                count++;
            }
        }
        System.out.println("В предложении столько ! - " + count);
    }
}
