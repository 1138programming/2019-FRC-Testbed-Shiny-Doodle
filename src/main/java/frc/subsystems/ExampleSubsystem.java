package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class ExampleSubsystem extends Subsystem {
  private final TalonSRX exampleFirst, exampleSecond; 
  public static final int KExampleFirst = 0;
  public static final int KExampleSecond = 1; 
  public static final double KSpeed = 1.0; 

  public ExampleSubsystem() {
    exampleFirst = new TalonSRX(KExampleFirst);
    exampleSecond = new TalonSRX(KExampleSecond);

    exampleSecond.follow(exampleFirst);
  }

  public void initDefaultCommand() {
  }

  public void exampleMethod() {
      exampleFirst.set(ControlMode.PercentOutput, KSpeed);
  }
}