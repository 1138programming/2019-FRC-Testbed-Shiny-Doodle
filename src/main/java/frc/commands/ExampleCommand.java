package frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ExampleCommand extends Command {
    public ExampleCommand() {
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.EXAMPLE_SUBSYSTEM.exampleMethod();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
    }
}