package org.example.strategy.move;

import org.example.MarsRover;

public interface Move {
    void moveBack(MarsRover rover);
    void moveForward(MarsRover rover);

}
