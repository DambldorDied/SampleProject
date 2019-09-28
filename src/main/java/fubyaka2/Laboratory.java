package fubyaka2;

import java.util.Scanner;

public class Laboratory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double leng = sc.nextDouble();
        double e = sc.nextDouble();
        double meazure = -1;
        while(meazure != 0) {
            meazure = sc.nextDouble();
            if(meazure < leng - e || meazure > leng + e) {
                System.out.println("You are stupid. NO!");
            }
            else {
                System.out.println("Good.");
            }
        }
    }
}
