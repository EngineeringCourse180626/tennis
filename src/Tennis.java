public class Tennis {
    private final String firstPlayerName;
    private final String secondPlayerName;
    private int firstPlayerScore;
    private int secondPlayerScore;

    private String[] scoreLookup = {"Love", "Fifteen", "Thirty", "Forty"};

    public Tennis(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String score() {
        if (isSameScore())
            if (firstPlayerScore >= 3)
                return "Deuce";
            else
                return scoreLookup[firstPlayerScore] + " All";

        if (secondPlayerScore > 3 && secondPlayerScore - firstPlayerScore == 1)
            return secondPlayerName + " Adv";

        if (firstPlayerScore > 3 && firstPlayerScore - secondPlayerScore == 1)
            return firstPlayerName + " Adv";

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
