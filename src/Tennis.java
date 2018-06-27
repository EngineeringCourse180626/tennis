public class Tennis {
    private int firstPlayerScore;

    public String score() {
        if (firstPlayerScore == 1)
            return "Fifteen Love";

        return "Love All";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
