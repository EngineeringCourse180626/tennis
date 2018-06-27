public class Tennis {
    private int firstPlayerScore;
    private int secondPlayerScore;

    private String[] scoreLookup = {"Love", "Fifteen", "Thirty", "Forty"};

    public String score() {
        if (isSameScore())
            return "Love All";

        return scoreLookup[firstPlayerScore] + " " + scoreLookup[secondPlayerScore];
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
