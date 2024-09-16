import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    App app = new App();
    @Test
    public void addMe() {
        assertEquals(12.0, app.addMe(11.0f,1.0f));
    }

    @Test
    public void subMe() {
        assertEquals(3.0, app.subMe(5.0f,2.0f));
    }
}