package org.example;

import org.example.strategy.command.Command;
import org.example.strategy.command.MoveBackCommand;
import org.example.strategy.command.MoveForwardCommand;
import org.example.strategy.command.TurnLeftCommand;
import org.example.strategy.command.TurnRightCommand;

public enum CommandType {
    L(TurnLeftCommand.class),
    R(TurnRightCommand.class),
    M(MoveForwardCommand.class),
    B(MoveBackCommand.class);

    final Class<? extends Command> commandHandler;

    CommandType(Class<? extends Command> commandHandler) {
        this.commandHandler = commandHandler;
    }

    public Command getCommandHandlerClass(MarsRover rover) {
        try {
            return commandHandler.getConstructor(MarsRover.class).newInstance(rover);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
