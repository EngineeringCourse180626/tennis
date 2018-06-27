import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {

    Tennis tennis = new Tennis();

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
        tennis.secondPlayerScore();
        tennis.secondPlayerScore();

        assertScoreEquals("Love Thirty");
    }

    private void givenFirstPlayerScore(int score) {
        for (int index = 0; index < score; index++)
            tennis.firstPlayerScore();
    }

    private void assertScoreEquals(String expected) {
        assertEquals(expected, tennis.score());
    }
}
