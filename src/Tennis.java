public class Tennis {
    private int firstPlayerScore;
    private int secondPlayerScore;

    private String[] scoreLookup = {"Love", "Fifteen", "Thirty", "Forty"};

    public String score() {
        if (isSameScore())
            if (firstPlayerScore >= 3)
                return "Deuce";
            else
                return scoreLookup[firstPlayerScore] + " All";

        return scoreLookup[firstPlayerScore] + " " + scoreLookup[secondPlayerScore];
    }

    private boolean isSameScore() {
        return firstPlayerScore == secondPlayerScore;
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }

    public void secondPlayerScore() {
        secondPlayerScore++;
    }
}
