package org.example;

import java.util.Arrays;

public class MarsRover {

    private int x;
    private int y;
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
        return this.x + ": " + this.y + ": " + this.direction;
    }

    private void analysisCommand(String command) {
        CommandType commandType = CommandType.valueOf(command);
        if (command == null) {
            return;
        }
        // todo 实例化时机
        commandType.getCommandHandlerClass(this).execute();
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Diretion getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(Diretion direction) {
        this.direction = direction;
    }
}
