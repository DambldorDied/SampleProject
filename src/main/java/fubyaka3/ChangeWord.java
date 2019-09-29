package fubyaka3;

public class ChangeWord {
    public static String changeWord(String text) {
        if(text.isEmpty()) {
            return text;
        }
        String text2 = "";
        while (text.contains("love")) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == 'l' && text.charAt(i + 1) == 'o' && text.charAt(i + 2) == 'v' && text.charAt(i + 3) == 'e') {
                        for (int j = 0; j < i; j++) {
                            text2 += text.charAt(j);
                        }
                        text2 += "***";
                        for (int j = i + 4; j < text.length(); j++) {
                            text2 += text.charAt(j);
                        }
                    }
                }
                text = text2;
        }
        return text2;
    }
}
