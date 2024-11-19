package org.example.strategy.command;

import org.example.MarsRover;

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
        rover.getDirection().getMoveHandler().moveBack(rover);
    }

}
