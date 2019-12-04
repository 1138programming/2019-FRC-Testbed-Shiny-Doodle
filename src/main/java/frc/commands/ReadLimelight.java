package frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.subsystems.LimelightSubsystem;

public class ReadLimelight extends Command {
    public ReadLimelight() {
        requires(Robot.LIMELIGHT_SUBSYSTEM);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double x = Robot.LIMELIGHT_SUBSYSTEM.getTX();
        double y = Robot.LIMELIGHT_SUBSYSTEM.getTY();
        double area = Robot.LIMELIGHT_SUBSYSTEM.getTArea();
        SmartDashboard.putString("Limelight Stuff", x + " " + y + " " + area);
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