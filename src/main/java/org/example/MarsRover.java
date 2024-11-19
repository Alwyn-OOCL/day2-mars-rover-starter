package org.example;

public class MarsRover {

    private int x;
    private int y;
    private String direction;

    public MarsRover() {
        this.x = 0;
        this.y = 0;
        this.direction = "N";
    }

    public String showStatusReport() {
        return this.x + " " + this.y + " " + this.direction;
    }
}
