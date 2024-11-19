package org.example.strategy.command;

import org.example.MarsRover;

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
        rover.getDirection().getMoveHandler().moveForward(rover);
    }

}
