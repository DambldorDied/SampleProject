package fubyaka2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperature;
        temperature = sc.nextFloat();
        if(temperature >= 36.5 && temperature <= 36.7) {
            System.out.println("you are stupid because you must know which temperture is normal. Temperture is normal.");
        }
        else {
            System.out.println("Temperature isn't normal.");
        }
    }
}
