package dz1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int result = sc.nextInt();
        while(result != 1) {
            if(result % number1 == 0) {
                result = result / number1;
            }
            if(result % number2 == 0) {
                result = result / number2;
            }
            if(result % number1 != 0 && result % number2 != 0) {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");
    }
}
