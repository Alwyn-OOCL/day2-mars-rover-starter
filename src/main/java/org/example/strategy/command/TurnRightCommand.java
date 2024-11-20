package org.example.strategy.command;

import org.example.DirectionUtils;
import org.example.MarsRover;

public class TurnRightCommand implements Command {

    private final MarsRover rover;

    public TurnRightCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        turnRight(rover);
    }

    private void turnRight(MarsRover rover) {
        int currentDirectionIndex = DirectionUtils.DIRECTIONS.indexOf(rover.getDirection());
        int nextDirectionIndex = (currentDirectionIndex + 1) % 4;
        rover.setDirection(DirectionUtils.DIRECTIONS.get(nextDirectionIndex));
    }

}
