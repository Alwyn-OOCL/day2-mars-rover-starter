package org.example.strategy.command;

import org.example.MarsRover;

public class MoveBackCommand extends MoveCommand implements Command {

    private final MarsRover rover;

    public MoveBackCommand(MarsRover rover) {
        super(rover);
        this.rover = rover;
    }

    @Override
    public void execute() {
        moveBack(rover);
    }

    private void moveBack(MarsRover rover) {
        getMoveHandlerMap().get(rover.getDirection()).moveBack(rover);
    }

}
