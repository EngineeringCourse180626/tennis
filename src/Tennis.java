import java.util.HashMap;

public class Tennis {
    private int firstPlayerScore;
    private int secondPlayerScore;

    private HashMap<Integer, String> scoreLookup = new HashMap<Integer, String>() {{
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
    }};

    public String score() {
        if (isSameScore())
            return "Love All";

        return scoreLookup.get(firstPlayerScore) + " " + scoreLookup.get(secondPlayerScore);
    }

    private boolean isSameScore() {
        return firstPlayerScore == 0 && secondPlayerScore == 0;
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }

    public void secondPlayerScore() {
        secondPlayerScore++;
    }
}
