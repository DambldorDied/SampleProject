package fubyaka5;

public class ArrSum {
    static int simpleArraySum(int[] ar) {
        int sumArr = 0;
        for (int i = 0; i < ar.length; i++) {
            sumArr += ar[i];
        }
        return sumArr;
    }
}
