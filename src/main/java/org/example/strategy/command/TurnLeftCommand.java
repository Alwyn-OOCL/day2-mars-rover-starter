package org.example.strategy.command;

import org.example.DirectionUtils;
import org.example.MarsRover;

public class TurnLeftCommand implements Command {

    private final MarsRover rover;

    public TurnLeftCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        turnLeft(rover);
    }

    private void turnLeft(MarsRover rover) {
        int directionLength = DirectionUtils.DIRECTIONS.size();
        int currentDirectionIndex = DirectionUtils.DIRECTIONS.indexOf(rover.getDirection());
        int nextDirectionIndex = (currentDirectionIndex + (directionLength - 1)) % directionLength;
        rover.setDirection(DirectionUtils.DIRECTIONS.get(nextDirectionIndex));
    }

}
