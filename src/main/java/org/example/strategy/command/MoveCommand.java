package org.example.strategy.command;

import org.example.Diretion;
import org.example.MarsRover;
import org.example.strategy.move.Move;

import java.util.HashMap;
import java.util.Map;

public abstract class MoveCommand implements Command {

    public final MarsRover rover;
    public final Map<Diretion, Move> moveHandlerMap = new HashMap<>();

    public MoveCommand(MarsRover rover) {
        this.rover = rover;
        for (Diretion direction : Diretion.values()) {
            moveHandlerMap.put(direction, direction.getMoveHandler());
        }
    }

    public Map<Diretion, Move> getMoveHandlerMap() {
        return moveHandlerMap;
    }
}