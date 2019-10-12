package fubyaka5;

import java.util.List;

public class CompareTheTest {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                sumA++;
            }
            if (b.get(i) > a.get(i)) {
                sumB++;
            }
        }
        List<Integer> c = null;
        c.add(sumA);
        c.add(sumB);
        return c;
    }

    public static void main(String[] args) {
        List<Integer> a = null;
        a.add(6);
        a.add(7);
        a.add(8);
        List<Integer> b = null;
        b.add(7);
        b.add(6);
        b.add(9);
        List<Integer> n = compareTriplets(a, b);
        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
    }
}
