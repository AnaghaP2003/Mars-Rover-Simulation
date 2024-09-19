/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsroversimulation;

public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(Grid grid) throws Exception {
        int newX = x, newY = y;
        switch (direction) {
            case N -> newY++;
            case S -> newY--;
            case E -> newX++;
            case W -> newX--;
        }
        if (!grid.isObstacle(newX, newY)) {
            this.x = newX;
            this.y = newY;
        } else {
            throw new Exception("Obstacle detected at: (" + newX + ", " + newY + ")");
        }
    }

    public void turnLeft() {
        direction = direction.left();
    }

    public void turnRight() {
        direction = direction.right();
    }

    public String getPosition() {
        return "(" + x + ", " + y + ")";
    }

    public Direction getDirection() {
        return direction;
    }

    public String getStatusReport() {
        return "Rover is at " + getPosition() + " facing " + direction + ".";
    }
}

