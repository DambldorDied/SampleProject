package fubyaka1;

import java.util.Scanner;

public class Justice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a money: ");
        int money = sc.nextInt();
        System.out.print("Enter a count family: ");
        int countFamily = sc.nextInt();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        int priceForFamily = price * countFamily;
        while (true) {
            if(money < priceForFamily) {
                System.out.println("Sorry, you haven't money.");
                System.exit(0);
            }
            else {
                System.out.println("Your balance now - "+ (money - priceForFamily));
                money -= priceForFamily;
            }
            System.out.print("Enter new price: ");
            price = sc.nextInt();
            priceForFamily = price * countFamily;
        }
    }
}
