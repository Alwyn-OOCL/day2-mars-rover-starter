import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.example.MarsRover;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

    @Test
    void should_initialize_mars_rover() {
        MarsRover marsRover = new MarsRover();
        assertNotNull(marsRover);
    }

    @Test
    void should_show_statusReport_when_showStatusReport() {
        MarsRover marsRover = new MarsRover();
        String statusReport = marsRover.showStatusReport();
        assertEquals("0 0 N", statusReport);
    }
}
