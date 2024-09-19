/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsroversimulation;

import java.util.List;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        try {
            // Create grid
            Grid grid = new Grid(10, 10);
            grid.addObstacle(2, 2);
            grid.addObstacle(3, 5);

            // Initialize rover
            Rover rover = new Rover(0, 0, Direction.N);

            // Command sequence: Move, Move, Right, Move, Left, Move
            List<Command> commands = List.of(
                new MoveCommand(rover, grid),
                new MoveCommand(rover, grid),
                new RightCommand(rover),
                new MoveCommand(rover, grid),
                new LeftCommand(rover),
                new MoveCommand(rover, grid)
            );

            // Execute commands
            for (Command command : commands) {
                command.execute();
            }

            // Output results
            System.out.println("Rover Position: " + rover.getPosition());
            System.out.println("Rover Direction: " + rover.getDirection());
            System.out.println(rover.getStatusReport());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

