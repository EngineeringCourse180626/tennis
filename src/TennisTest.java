import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {

    Tennis tennis = new Tennis();

    @Test
    public void love_all() {
        assertScoreEquals("Love All");
    }

    private void assertScoreEquals(String expected) {
        assertEquals(expected, tennis.score());
    }
}
