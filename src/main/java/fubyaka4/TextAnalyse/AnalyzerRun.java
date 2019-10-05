package fubyaka4.TextAnalyse;

import java.util.Scanner;

public class AnalyzerRun {
    public static void main(String[] args) {
        Analyzer[] analyzers = new Analyzer[3];
        analyzers[0] = new LengthAnalyser(200);
        analyzers[1] = new SpamAnalyse(new String[]{"кредит", "микрозайм"});
        analyzers[2] = new SwearAnalyse();
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        boolean[] mas = new boolean[3];
        for (int i = 0; i < analyzers.length; i++) {
            System.out.println(analyzers[i].analyse(text));
            mas[i] = analyzers[i].analyse(text);
        }
        if(mas[0] == true && mas[1] == true && mas[2] == true) {
            System.out.println("Проходит.");
        }
        else {
            System.out.println("Не проходит. БАН!");
        }
    }
}
