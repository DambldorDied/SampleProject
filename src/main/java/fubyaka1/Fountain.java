package fubyaka1;

import java.util.Scanner;

public class Fountain {
    public static void main(String[] args) {
        int money = 0;
        int money2;
        int mostMoney = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Monetka nominalom ");
            money2 = sc.nextInt();
            if (money2 == 1 || money2 == 2 || money2 == 5 || money2 == 10) {
                money += money2;
                if(mostMoney < money2) {
                    mostMoney = money2;
                }
            }
            else {
                System.out.println("Tvoya most expensiv monetka - "+ mostMoney);
                System.out.println("Ti sobral - "+ money);
                System.out.println("Itog: ti bomj.");
                System.exit(0);
            }
        }
    }
}
