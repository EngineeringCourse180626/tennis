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
        tennis.firstPlayerScore();
        tennis.firstPlayerScore();

        assertScoreEquals("Thirty Love");
    }

    private void assertScoreEquals(String expected) {
        assertEquals(expected, tennis.score());
    }
}
