package fubyaka5;

public class Kangoroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1 != x2 && v1==v2) {
            return  "NO";
        }
        if(x1 != x2 && x1+v1 == x2 + v2) {
            return "YES";
        }
        int x12 = x1;
        int x22 = x2;
        for (; x12 <= 10000000 || x22 <= 1000000;) {
            if(x12 == x22) {
                return "YES";
            }
            x12 += v1;
            x22 += v2;
        }
        return "NO";
    }

}
