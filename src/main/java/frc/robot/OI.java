//@TODO Figure out XBox triggers, get Sparks MAX working, make Pneumatics and Camera subsystems, vision integration into 
//the hatches, the hatch commands themselves (with x_table), and all of the encoder-based stuff for the arm and lift positions 
//(and maybe climb but that's lower priority)

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class OI {
  /**
   * Controller Constants public static final int KLogitechDrive = 0; public
   * static final int KXboxArms = 1;
   * 
   * DeadZone public static final double KDeadZone = 0.2;
   * 
   * Logitech Button Constants public static final int KButton1 = 1; public static
   * final int KButton2 = 2; public static final int KButton3 = 3; public static
   * final int KButton4 = 4; public static final int KButton5 = 5; public static
   * final int KButton6 = 6; public static final int KButton7 = 7; public static
   * final int KButton8 = 8;
   * 
   * Xbox Button Constants public static final int KButtonA = 1; public static
   * final int KButtonB = 2; public static final int KButtonX = 3; public static
   * final int KButtonY = 4; public static final int KLeftBumper = 5; public
   * static final int KRightBumper = 6; public static final int KStartButton = 8;
   * public static final int KLeftTrigger = 9; public static final int
   * KRightTrigger = 10;
   * 
   * public Joystick logitech; public XboxController xbox; public JoystickButton
   * btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8; // Logitech Button public
   * JoystickButton btnA, btnB, btnX, btnY, btnLB, btnRB, btnStrt, btnLT, btnRT;
   * // Xbox Buttons
   */

  //Controller Constants 
  private static final int KLogitechDrive = 0;
  private static final int KXboxArms = 1;
  private static final int KXboxBackup = 2;

  //DeadZone 
  private static final double KDeadZone = 0.2; 

  //Logitech Button Constants 
  private static final int KButton1 = 1;
	private static final int KButton2 = 2;
	private static final int KButton3 = 3;
	private static final int KButton4 = 4;
	private static final int KButton5 = 5;
	private static final int KButton6 = 6;
	private static final int KButton7 = 7;
  private static final int KButton8 = 8;
  private static final int KButton9 = 9;
  private static final int KButton10 = 10;
  private static final int KLeftYAxis = 1;
  private static final int KRightYAxis = 3;   //2, 4,5

  //Xbox Button Constants 
  private static final int KButtonA = 1;
	private static final int KButtonB = 2;
	private static final int KButtonX = 3;
	private static final int KButtonY = 4;
	private static final int KLeftBumper = 5;
  private static final int KRightBumper = 6;
  private static final int KSwitchButton = 7;
	private static final int KStartButton = 8;
	private static final int KLeftTrigger = 9;
  private static final int KRightTrigger = 10;

  //Backup Button Constants
  private static final int KButtonABackup = 1;
	private static final int KButtonBBackup = 2;
	private static final int KButtonXBackup = 3;
	private static final int KButtonYBackup = 4;
	private static final int KLeftBumperBackup = 5;
  private static final int KRightBumperBackup = 6;
  private static final int KSwitchButtonBackup = 7;
	private static final int KStartButtonBackup = 8;
	private static final int KLeftTriggerBackup = 9;
  private static final int KRightTriggerBackup = 10;

  public static Joystick logitech;
  public static XboxController xbox, backup;
	public static JoystickButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10; // Logitech Button
  public static JoystickButton btnA, btnB, btnX, btnY, btnLB, btnRB, btnSwtch, btnStrt, btnLT, btnRT; // Xbox Buttons
  public static JoystickButton btnABackup , btnBBackup , btnXBackup , btnYBackup , btnLBBackup , btnRBBackup , btnSwtchBackup , btnStrtBackup , btnLTBackup , btnRTBackup; // Xbox Buttons

  public OI() {
    //Controllers 
    logitech = new Joystick(KLogitechDrive);

    SmartDashboard.putNumber("Throttle channel is: ", logitech.getThrottleChannel());

    //xbox = new XboxController(KXboxArms);
    xbox = new XboxController(KXboxArms);
    backup = new XboxController(KXboxBackup);

    //Logitech Buttons
		btn1 = new JoystickButton(logitech, KButton1);
		btn2 = new JoystickButton(logitech, KButton2);
		btn3 = new JoystickButton(logitech, KButton3);
		btn4 = new JoystickButton(logitech, KButton4);
		btn5 = new JoystickButton(logitech, KButton5);
		btn6 = new JoystickButton(logitech, KButton6);
		btn7 = new JoystickButton(logitech, KButton7);
    btn8 = new JoystickButton(logitech, KButton8);
    btn9 = new JoystickButton(logitech, KButton9);
    btn10 = new JoystickButton(logitech, KButton10);

		//XBox Buttons
		btnA = new JoystickButton(xbox, KButtonA);
		btnB = new JoystickButton(xbox, KButtonB);
		btnX = new JoystickButton(xbox, KButtonX);
		btnY = new JoystickButton(xbox, KButtonY);
		btnLB = new JoystickButton(xbox, KLeftBumper);
    btnRB = new JoystickButton(xbox, KRightBumper);
    btnSwtch = new JoystickButton(xbox, KSwitchButton);
		btnStrt = new JoystickButton(xbox, KStartButton);
		btnLT = new JoystickButton(xbox, KLeftTrigger);
    btnRT = new JoystickButton(xbox, KRightTrigger);

    //Stick Buttons
    btnABackup = new JoystickButton(xbox, KButtonABackup);
		btnBBackup = new JoystickButton(xbox, KButtonBBackup);
		btnXBackup = new JoystickButton(xbox, KButtonXBackup);
		btnYBackup = new JoystickButton(xbox, KButtonYBackup);
		btnLBBackup = new JoystickButton(xbox, KLeftBumperBackup);
    btnRBBackup = new JoystickButton(xbox, KRightBumperBackup);
    btnSwtchBackup = new JoystickButton(xbox, KSwitchButtonBackup);
		btnStrtBackup = new JoystickButton(xbox, KStartButtonBackup);
		btnLTBackup = new JoystickButton(xbox, KLeftTriggerBackup);
    btnRTBackup = new JoystickButton(xbox, KRightTriggerBackup);
  }


  public double getRightAxis() {
    double Y = logitech.getRawAxis(KRightYAxis);
    SmartDashboard.putNumber("Here's a thingy!", Y);
    if (Y > KDeadZone || Y < -KDeadZone)
      return Y;
    else
      return 0;
  }

  public double getArcadeRightAxis() {
    if(logitech.getTwist() > KDeadZone || logitech.getTwist() < -KDeadZone)
      return logitech.getTwist();
    else
      return 0.0;
  }

  public double getLeftAxis() {
    double Y = logitech.getRawAxis(KLeftYAxis);
    SmartDashboard.putNumber("Here's a left thingy!", Y);
    if(Y > KDeadZone || Y < -KDeadZone)
      return Y;
    else 
      return 0.0; 
  }

  public double getRightXbox() {
    if(xbox.getY(Hand.kRight) > KDeadZone || xbox.getY(Hand.kRight) < -KDeadZone) 
      return xbox.getY(Hand.kRight);
    else 
      return 0.0;
  }

  public double getLeftXbox() {
    if(xbox.getY(Hand.kLeft) > KDeadZone || xbox.getY(Hand.kLeft) < -KDeadZone) 
      return -xbox.getY(Hand.kLeft);
    else 
      return 0;
  }

  public double getRightXboxBackup() {
    if(backup.getY(Hand.kRight) > KDeadZone || backup.getY(Hand.kRight) < -KDeadZone) 
      return backup.getY(Hand.kRight);
    else 
      return 0;
  }

  public double getLeftXboxBackup() {
    if(backup.getY(Hand.kLeft) > KDeadZone || backup.getY(Hand.kLeft) < -KDeadZone) 
      return -backup.getY(Hand.kLeft);
    else 
      return 0;
  }


  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}