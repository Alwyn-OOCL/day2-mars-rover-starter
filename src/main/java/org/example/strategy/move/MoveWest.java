package org.example.strategy.move;

import org.example.MarsRover;

public class MoveWest implements Move {

    @Override
    public void moveBack(MarsRover rover) {
        rover.setX(rover.getX() + 1);
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setX(rover.getX() - 1);
    }

}
