package org.example;

public class MarsRover {

    private int x;
    private int y;
    private Diretion direction;

    public MarsRover() {
        this.direction = Diretion.N;
    }

    public String executeCommand(String command) {
        analysisCommand(command);
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
