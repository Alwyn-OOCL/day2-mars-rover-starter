package org.example;

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
