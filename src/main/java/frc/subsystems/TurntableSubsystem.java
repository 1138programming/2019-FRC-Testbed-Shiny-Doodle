package frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import frc.commands.DriveWithJoy;

public class TurntableSubsystem extends Subsystem {
  private final TalonSRX turntableMotor; 
  public static final int KTurntableMotor = 0;

  public TurntableSubsystem() {
    turntableMotor = new TalonSRX(KTurntableMotor);

    //rightMotor.follow(leftMotor);
  }

  public void initDefaultCommand() {
      setDefaultCommand(new DriveWithJoy());
  }

  public void turntableRotate (double speed) {
      turntableMotor.set(ControlMode.PercentOutput, speed);
  }
}