package frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TiltReverse extends Command {
    public TiltReverse() {
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.TILTER_SUBSYSTEM.tilterMove(1.0);
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