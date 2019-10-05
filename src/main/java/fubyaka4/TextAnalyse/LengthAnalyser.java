package fubyaka4.TextAnalyse;

public class LengthAnalyser implements Analyzer {
    private int maxLength;

    public LengthAnalyser(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean analyse(String text) {
        if(text.length() > maxLength) {
            return false;
        }
        else {
            return true;
        }
    }
}
