package org.example.strategy.move;

import org.example.MarsRover;

public class MoveNorth implements Move {

    @Override
    public void moveBack(MarsRover rover) {
        rover.setY(rover.getY() - 1);
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setY(rover.getY() + 1);
    }

}
