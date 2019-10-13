package fubyaka6;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e) {
           // System.out.println("Упс");
            System.out.println(e.getMessage());
        }
    }
}
