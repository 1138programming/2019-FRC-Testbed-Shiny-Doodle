package frc.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.commands.DriveWithJoy;
import frc.commands.ReadLimelight;

public class LimelightSubsystem extends Subsystem {
  double x, y, area;
  NetworkTableEntry tx, ty, ta;
  //public static final double KSpeed = 1.0; 

  public LimelightSubsystem() {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
     tx = table.getEntry("tx");
     ty = table.getEntry("ty");
     ta = table.getEntry("ta"); 
  }

  public void initDefaultCommand() {
      setDefaultCommand(new ReadLimelight());
  }

  public double getTX() {
      return tx.getDouble(0.0);
  }

  public double getTY() {
      return ty.getDouble(0.0);
  }

  public double getTArea() {
      return ta.getDouble(0.0);
  }
}