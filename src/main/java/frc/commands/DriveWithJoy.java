package frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveWithJoy extends Command {
    public DriveWithJoy() {
        requires(Robot.BASE_SUBSYSTEM);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double leftSpeed = Robot.oi.getLeftAxis();
        double rightSpeed = Robot.oi.getLeftAxis(); 

        Robot.BASE_SUBSYSTEM.baseDrive(leftSpeed, rightSpeed);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
    }
}