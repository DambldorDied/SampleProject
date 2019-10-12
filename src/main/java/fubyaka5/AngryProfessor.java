package fubyaka5;

public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        int countN = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] <= 0) {
                countN++;
            }
        }
        if(countN >= k) {
            return "NO";
        }
        else
        {
            return "YES";
        }
    }
}
