package frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TurntableReverse extends Command {
    public TurntableReverse() {
        requires(Robot.TURNTABLE_SUBSYSTEM);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.TURNTABLE_SUBSYSTEM.turntableRotate(-1.0);
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