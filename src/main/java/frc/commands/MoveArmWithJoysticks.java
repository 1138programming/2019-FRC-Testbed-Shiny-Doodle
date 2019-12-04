package frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class MoveArmWithJoysticks extends Command {
    public MoveArmWithJoysticks() {
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.ARM_SUBSYSTEM.moveArm(Robot.oi.getRightXbox());
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