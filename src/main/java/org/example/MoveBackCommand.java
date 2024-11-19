package org.example;

public class MoveBackCommand implements Command {

    private final MarsRover rover;

    public MoveBackCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        moveBack(rover);
    }

    private void moveBack(MarsRover rover) {
        if (rover.getDirection() == Diretion.N) {
            rover.setY(rover.getY() - 1);
        } else if (rover.getDirection() == Diretion.E) {
            rover.setX(rover.getX() - 1);
        } else if (rover.getDirection() == Diretion.S) {
            rover.setY(rover.getY() + 1);
        } else {
            rover.setX(rover.getX() + 1);
        }
    }

}
