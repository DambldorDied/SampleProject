package fubyaka3;

import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 346 + i;
            System.out.println(mas[i]);
        }
    }
    public static int countZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countMidAr(int[] arr) {
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        return sumArr / arr.length;
    }
}
