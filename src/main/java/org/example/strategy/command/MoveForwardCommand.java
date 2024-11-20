package org.example.strategy.command;

import org.example.MarsRover;

public class MoveForwardCommand extends MoveCommand implements Command {

    private final MarsRover rover;

    public MoveForwardCommand(MarsRover rover) {
        super(rover);
        this.rover = rover;
    }

    @Override
    public void execute() {
        moveForward(rover);
    }

    private void moveForward(MarsRover rover) {
        getMoveHandlerMap().get(rover.getDirection()).moveForward(rover);
    }

}
