import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {

    @Test
    public void love_all() {
        Tennis tennis = new Tennis();

        assertEquals("Love All", tennis.score());
    }
}
