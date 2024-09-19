/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsroversimulation;

public class MoveCommand implements Command {
    private final Rover rover;
    private final Grid grid;

    public MoveCommand(Rover rover, Grid grid) {
        this.rover = rover;
        this.grid = grid;
    }

    @Override
    public void execute() throws Exception {
        rover.move(grid);
    }
}



