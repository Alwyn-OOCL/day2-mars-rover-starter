package org.example.strategy.move;

import org.example.MarsRover;

public class MoveNorth implements Move {

    @Override
    public void moveBack(MarsRover rover) {
        rover.setyCoordinate(rover.getyCoordinate() - 1);
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setyCoordinate(rover.getyCoordinate() + 1);
    }

}
