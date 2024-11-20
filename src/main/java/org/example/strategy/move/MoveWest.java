package org.example.strategy.move;

import org.example.MarsRover;

public class MoveWest implements Move {

    @Override
    public void moveBack(MarsRover rover) {
        rover.setxCoordinate(rover.getxCoordinate() + 1);
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setxCoordinate(rover.getxCoordinate() - 1);
    }

}
