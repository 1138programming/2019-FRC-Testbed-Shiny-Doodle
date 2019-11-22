package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import frc.commands.DriveWithJoy;

public class BaseSubsystem extends Subsystem {
  private final TalonSRX leftMotor, rightMotor; 
  public static final int KExampleFirst = 0;
  public static final int KExampleSecond = 1; 
  //public static final double KSpeed = 1.0; 

  public BaseSubsystem() {
    leftMotor = new TalonSRX(KExampleFirst);
    rightMotor = new TalonSRX(KExampleSecond);

    //rightMotor.follow(leftMotor);
  }

  public void initDefaultCommand() {
      setDefaultCommand(new DriveWithJoy());
  }

  public void baseDrive(double leftSpeed, double rightSpeed) {
      leftMotor.set(ControlMode.PercentOutput, leftSpeed);
      rightMotor.set(ControlMode.PercentOutput, rightSpeed);
  }
}