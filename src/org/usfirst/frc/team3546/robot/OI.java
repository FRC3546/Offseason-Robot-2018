package org.usfirst.frc.team3546.robot;
import org.usfirst.frc.team3546.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick leftJoystick;
	public Joystick rightJoystick;

	public JoystickButton lowGearButton;
	public JoystickButton highGearButton;

	public JoystickButton invertDriveTrainButton;

	public JoystickButton forwardDriveButton;
	public JoystickButton reverseDriveButton;

	public JoystickButton printPotentiometerButton;





	public OI (){
		leftJoystick = new Joystick(0);
		rightJoystick = new Joystick(1);
		
		//sweeperBarRotationInButton = new JoystickButton(leftJoystick,1);
		//sweeperBarRotationInButton.whileHeld(new SweeperBarRotationIn());
		//sweeperBarRotationOutButton = new JoystickButton(leftJoystick,2);
		//sweeperBarRotationOutButton.whileHeld(new SweeperBarRotationOut());

		printPotentiometerButton = new JoystickButton(leftJoystick, 4);
		printPotentiometerButton.whenPressed(new PrintPotentiometer());

		forwardDriveButton = new JoystickButton(rightJoystick, 3);
		forwardDriveButton.whenPressed(new ForwardDrive());
		reverseDriveButton = new JoystickButton(rightJoystick, 2);
		reverseDriveButton.whenPressed(new ReverseDrive());
		
		highGearButton = new JoystickButton(leftJoystick, 3);
		highGearButton.whenPressed(new DriveTrainHighGear());
		lowGearButton = new JoystickButton(leftJoystick, 2);
		lowGearButton.whenPressed(new DriveTrainLowGear());
		}
	
	public Joystick getLeftJoystick() { return leftJoystick; }
	public Joystick getRightJoystick() { return rightJoystick; }
	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

