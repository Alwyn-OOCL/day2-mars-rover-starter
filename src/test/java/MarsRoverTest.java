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
        assertEquals("0: 0: N", statusReport);
    }

    @Test
    void should_face_west_when_orient_north_and_turn_left() {
        MarsRover marsRover = new MarsRover();
        String command = "L";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 0: W", statusReport);
    }

    @Test
    void should_face_south_when_orient_west_and_turn_left() {
        MarsRover marsRover = new MarsRover();
        String command = "L";
        marsRover.executeCommand(command);
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 0: S", statusReport);
    }
}
