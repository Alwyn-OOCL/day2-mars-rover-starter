package org.example;

import org.example.strategy.move.Move;
import org.example.strategy.move.MoveEast;
import org.example.strategy.move.MoveNorth;
import org.example.strategy.move.MoveSouth;
import org.example.strategy.move.MoveWest;

public enum Diretion {
    N(MoveNorth.class),
    E(MoveEast.class),
    S(MoveSouth.class),
    W(MoveWest.class);

    final Class<? extends Move> moveHandler;

    Diretion(Class<? extends Move> moveHandler) {
        this.moveHandler = moveHandler;
    }

    public Move getMoveHandler() {
        try {
            return moveHandler.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
