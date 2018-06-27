import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {

    Tennis tennis = new Tennis("Joey", "Joseph");

    @Test
    public void love_all() {
        assertScoreEquals("Love All");
    }

    @Test
    public void fifteen_love() {
        tennis.firstPlayerScore();

        assertScoreEquals("Fifteen Love");
    }

    @Test
    public void thirty_love() {
        givenFirstPlayerScore(2);

        assertScoreEquals("Thirty Love");
    }

    @Test
    public void forty_love() {
        givenFirstPlayerScore(3);

        assertScoreEquals("Forty Love");
    }

    @Test
    public void love_fifteen() {
        tennis.secondPlayerScore();

        assertScoreEquals("Love Fifteen");
    }

    @Test
    public void love_thirty() {
        givenSecondPlayerScore(2);

        assertScoreEquals("Love Thirty");
    }

    @Test
    public void fifteen_all() {
        tennis.firstPlayerScore();
        tennis.secondPlayerScore();

        assertScoreEquals("Fifteen All");
    }

    @Test
    public void deuce() {
        givenDeuce();

        assertScoreEquals("Deuce");
    }

    @Test
    public void first_player_adv() {
        givenDeuce();
        givenFirstPlayerScore(1);

        assertScoreEquals("Joey Adv");
    }

    @Test
    public void second_player_adv() {
        givenDeuce();
        givenSecondPlayerScore(1);

        assertScoreEquals("Joseph Adv");
    }

    private void givenDeuce() {
        givenFirstPlayerScore(3);
        givenSecondPlayerScore(3);
    }

    private void givenFirstPlayerScore(int score) {
        for (int index = 0; index < score; index++)
            tennis.firstPlayerScore();
    }

    private void givenSecondPlayerScore(int score) {
        for (int index = 0; index < score; index++)
            tennis.secondPlayerScore();
    }

    private void assertScoreEquals(String expected) {
        assertEquals(expected, tennis.score());
    }
}
