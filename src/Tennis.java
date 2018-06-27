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

        if (isGamePoint())
            if (isAdvantage())
                return advantagerName() + " Adv";
            else
                return advantagerName() + " Win";

        return scoreLookup[firstPlayerScore] + " " + scoreLookup[secondPlayerScore];
    }

    private boolean isGamePoint() {
        return firstPlayerScore > 3 || secondPlayerScore > 3;
    }

    private boolean isAdvantage() {
        return Math.abs(firstPlayerScore - secondPlayerScore) == 1;
    }

    private String advantagerName() {
        return firstPlayerScore > secondPlayerScore ? firstPlayerName : secondPlayerName;
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
