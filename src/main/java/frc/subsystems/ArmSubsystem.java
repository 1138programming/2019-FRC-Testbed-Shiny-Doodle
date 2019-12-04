package frc.subsystems;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class ArmSubsystem extends Subsystem {
  private final TalonSRX armTalon;
  public static final int KArmTalon = 1; 
  public static final double KSpeed = 1.0; 

  public ArmSubsystem() {
    armTalon = new TalonSRX(KArmTalon);
  }

  public void initDefaultCommand() {
  }

  public void moveArm(double armSpeed) {
    armTalon.set(ControlMode.PercentOutput, armSpeed);
  }
}