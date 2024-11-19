package org.example;

public class MarsRover {

    private int x;
    private int y;
    private Diretion direction;

    public MarsRover() {
        this.x = 0;
        this.y = 0;
        this.direction = Diretion.N;
    }

    public String executeCommand(String command) {
        analysisCommand(command);
        return showStatusReport();
    }

    public String showStatusReport() {
        return this.x + ": " + this.y + ": " + this.direction;
    }

    private void turnLeft() {
        int currentIndex = DirectionUtils.DIRECTIONS.indexOf(this.direction);
        int nextIndex = (currentIndex + 3) % 4;
        this.direction = DirectionUtils.DIRECTIONS.get(nextIndex);
    }

    private void turnRight() {
        int currentIndex = DirectionUtils.DIRECTIONS.indexOf(this.direction);
        int nextIndex = (currentIndex + 1) % 4;
        this.direction = DirectionUtils.DIRECTIONS.get(nextIndex);
    }

    private void moveForward() {
        if (this.direction == Diretion.N) {
            this.y++;
        } else if (this.direction == Diretion.E) {
            this.x++;
        } else if (this.direction == Diretion.S) {
            this.y--;
        } else {
            this.x--;
        }
    }

    private void analysisCommand(String command) {
        if ("L".equals(command)) {
            turnLeft();
        } else if ("R".equals(command)) {
            turnRight();
        } else {
            moveForward();
        }
    }
}
