import java.util.HashMap;

public class Tennis {
    private int firstPlayerScore;

    private HashMap<Integer, String> scoreLookup = new HashMap<Integer, String>() {{
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
    }};

    public String score() {
        if (firstPlayerScore > 0)
            return scoreLookup.get(firstPlayerScore) + " Love";

        return "Love All";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
