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

    @Test
    void should_face_east_when_orient_south_and_turn_left() {
        MarsRover marsRover = new MarsRover();
        String command = "L";
        marsRover.executeCommand(command);
        marsRover.executeCommand(command);
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 0: E", statusReport);
    }

    @Test
    void should_face_north_when_orient_east_and_turn_left() {
        MarsRover marsRover = new MarsRover();
        String command = "L";
        marsRover.executeCommand(command);
        marsRover.executeCommand(command);
        marsRover.executeCommand(command);
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 0: N", statusReport);
    }

    @Test
    void should_face_east_when_orient_north_and_turn_right() {
        MarsRover marsRover = new MarsRover();
        String command = "R";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 0: E", statusReport);
    }

    @Test
    void should_face_south_when_orient_east_and_turn_right() {
        MarsRover marsRover = new MarsRover();
        String command = "R";
        marsRover.executeCommand(command);
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 0: S", statusReport);
    }

    @Test
    void should_face_west_when_orient_south_and_turn_right() {
        MarsRover marsRover = new MarsRover();
        String command = "R";
        marsRover.executeCommand(command);
        marsRover.executeCommand(command);
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 0: W", statusReport);
    }

    @Test
    void should_face_north_when_orient_west_and_turn_right() {
        MarsRover marsRover = new MarsRover();
        String command = "R";
        marsRover.executeCommand(command);
        marsRover.executeCommand(command);
        marsRover.executeCommand(command);
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 0: N", statusReport);
    }

    @Test
    void should_move_north_when_orient_north_and_move() {
        MarsRover marsRover = new MarsRover();
        String command = "M";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 1: N", statusReport);
    }

    @Test
    void should_move_east_when_orient_east_and_move() {
        MarsRover marsRover = new MarsRover();
        String command = "R";
        marsRover.executeCommand(command);
        command = "M";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("1: 0: E", statusReport);
    }

    @Test
    void should_move_south_when_orient_south_and_move() {
        MarsRover marsRover = new MarsRover();
        String command = "R";
        marsRover.executeCommand(command);
        marsRover.executeCommand(command);
        command = "M";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: -1: S", statusReport);
    }

    @Test
    void should_move_west_when_orient_west_and_move() {
        MarsRover marsRover = new MarsRover();
        String command = "L";
        marsRover.executeCommand(command);
        command = "M";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("-1: 0: W", statusReport);
    }

    @Test
    void should_move_south_when_orient_south_and_move_back() {
        MarsRover marsRover = new MarsRover();
        String command = "B";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: -1: N", statusReport);
    }

    @Test
    void should_move_east_when_orient_west_and_move_back() {
        MarsRover marsRover = new MarsRover();
        String command = "L";
        marsRover.executeCommand(command);
        command = "B";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("1: 0: W", statusReport);
    }

    @Test
    void should_move_north_when_orient_south_and_move_back() {
        MarsRover marsRover = new MarsRover();
        String command = "R";
        marsRover.executeCommand(command);
        marsRover.executeCommand(command);
        command = "B";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("0: 1: S", statusReport);
    }

    @Test
    void should_move_west_when_orient_east_and_move_back() {
        MarsRover marsRover = new MarsRover();
        String command = "R";
        marsRover.executeCommand(command);
        command = "B";
        String statusReport = marsRover.executeCommand(command);
        assertEquals("-1: 0: E", statusReport);
    }
}
