package org.example;

public class MoveForwardCommand implements Command {

    private final MarsRover rover;

    public MoveForwardCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        moveForward(rover);
    }

    private void moveForward(MarsRover rover) {
        if (rover.getDirection() == Diretion.N) {
            rover.setY(rover.getY() + 1);
        } else if (rover.getDirection() == Diretion.E) {
            rover.setX(rover.getX() + 1);
        } else if (rover.getDirection() == Diretion.S) {
            rover.setY(rover.getY() - 1);
        } else {
            rover.setX(rover.getX() - 1);
        }
    }

}
