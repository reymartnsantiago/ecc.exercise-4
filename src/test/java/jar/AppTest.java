package jar;

import org.junit.jupiter.api.Test;

import Exercise.UserInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URISyntaxException;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void chekcFile() throws URISyntaxException {
        UserInterface obj = new UserInterface();
        obj.getDefaultFile();
    }
}
