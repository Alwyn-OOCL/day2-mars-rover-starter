package org.example;

import java.util.Arrays;

public class MarsRover {

    private int xCoordinate;
    private int yCoordinate;
    private Diretion direction;

    public MarsRover() {
        this.direction = Diretion.N;
    }

    public String executeCommand(String command) {
        if (command.length() > 1) {
            Arrays.stream(command.split(" ")).forEach(this::analysisCommand);
        } else {
            analysisCommand(command);
        }
        return showStatusReport();
    }

    public String showStatusReport() {
        return this.xCoordinate + ": " + this.yCoordinate + ": " + this.direction;
    }

    private void analysisCommand(String command) {
        CommandType commandType = CommandType.valueOf(command);
        if (command == null) {
            return;
        }
        // todo 实例化时机
        commandType.getCommandHandlerClass(this).execute();
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
