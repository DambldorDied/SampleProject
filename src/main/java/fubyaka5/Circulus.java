package fubyaka5;

public class Circulus {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] mas = new int[a.length];
        for (int i = 0; i < k; i++) {
            mas[i] = a[i + k];
        }
        for (int i = k; i < a.length; i++) {
            mas[i] = a[i - k];
        }
        return mas;
    }
}
