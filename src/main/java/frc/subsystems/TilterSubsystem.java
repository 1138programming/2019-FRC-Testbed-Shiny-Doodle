package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class TilterSubsystem extends Subsystem {
  private final TalonSRX tilterTalon; 
  public static final int KTilterTalon = 0; 
  public static final double KSpeed = 1.0; 

  public TilterSubsystem() {
    tilterTalon = new TalonSRX(KTilterTalon);
  }

  public void initDefaultCommand() {
  }

  public void tilterTalon(double speed) {
      tilterTalon.set(ControlMode.PercentOutput, speed);
  }
}