package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.example.strategy.command.Command;

public class MarsRover {

    private int xCoordinate;
    private int yCoordinate;
    private Diretion direction;

    private final Map<CommandType, Command> commandHandlerMap = new HashMap<>();

    public MarsRover() {
        CommandType[] values = CommandType.values();
        Arrays.stream(values)
                .forEach(value -> commandHandlerMap.put(value, value.getCommandHandlerClass(this)));
        this.direction = Diretion.N;
    }

    public String executeCommand(String command) {
        Arrays.stream(command.split(" ")).forEach(this::analysisCommand);
        return showStatusReport();
    }

    public String showStatusReport() {
        return this.xCoordinate + ": " + this.yCoordinate + ": " + this.direction;
    }

    private void analysisCommand(String command) {
        CommandType commandType;
        try {
            commandType = CommandType.valueOf(command);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid command: " + command);
        }
        if (command == null) {
            return;
        }
        commandHandlerMap.get(commandType).execute();
    }


    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public Diretion getDirection() {
        return direction;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setDirection(Diretion direction) {
        this.direction = direction;
    }
}
