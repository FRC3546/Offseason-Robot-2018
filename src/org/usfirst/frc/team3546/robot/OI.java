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
	public Joystick coDrivingJoystick;

	public JoystickButton lowGearButton;
	public JoystickButton highGearButton;

	public JoystickButton forwardDriveButton;
	public JoystickButton reverseDriveButton;

	public JoystickButton fuelIntakeButton;
	public JoystickButton shootHighButton;
	public JoystickButton shootLowButton;
	public JoystickButton spitOutFuelButton;

	public JoystickButton closeandGoUpButton;
	public JoystickButton closeandGoDownButton;
	public JoystickButton gearOpenButton;
	public JoystickButton gearCloseButton;

	public JoystickButton climbingButton;
	public JoystickButton climbingReverseButton;
	public JoystickButton climbingClampInButton;
	public JoystickButton climbingClampOutButton;

	public JoystickButton shootsorthighButton;
	public JoystickButton shootsortlowButton;

	public JoystickButton storagesorthighButton;
	public JoystickButton storagesortlowButton;

	public OI (){
		leftJoystick = new Joystick(0);
		rightJoystick = new Joystick(1);
		coDrivingJoystick = new Joystick(2);

		//forwardDriveButton = new JoystickButton(rightJoystick,3);
		//forwardDriveButton.whenPressed(new ForwardDrive());
		//reverseDriveButton = new JoystickButton(rightJoystick, 2);
		//reverseDriveButton.whenPressed(new ReverseDrive());
		
		highGearButton = new JoystickButton(leftJoystick, 3);
		highGearButton.whenPressed(new DriveTrainHighGear());
		lowGearButton = new JoystickButton(leftJoystick, 2);
		lowGearButton.whenPressed(new DriveTrainLowGear());

		fuelIntakeButton = new JoystickButton(coDrivingJoystick, 1);
		fuelIntakeButton.whileHeld(new FuelIntake());
		shootHighButton = new JoystickButton(coDrivingJoystick, 3);
		shootHighButton.whileHeld(new ShootHigh());
		shootLowButton = new JoystickButton(coDrivingJoystick, 2);
		shootLowButton.whileHeld((new ShootLow()));
		spitOutFuelButton = new JoystickButton(coDrivingJoystick, 4);
		spitOutFuelButton.whileHeld(new FuelOutput());

		closeandGoUpButton = new JoystickButton(coDrivingJoystick, 6);
		closeandGoUpButton.whenPressed(new SetClampUp());
		closeandGoDownButton = new JoystickButton(coDrivingJoystick, 7);
		closeandGoDownButton.whenPressed(new SetClampDown());
		gearOpenButton = new JoystickButton(coDrivingJoystick, 8);
		gearOpenButton.whenPressed(new SetGearRelease());
		gearCloseButton = new JoystickButton(coDrivingJoystick, 8);
		gearCloseButton.whenReleased(new SetGearGrab());

		climbingButton = new JoystickButton(coDrivingJoystick, 11);
		climbingButton.whileHeld(new Climb());
		climbingReverseButton = new JoystickButton(coDrivingJoystick, 10);
		climbingReverseButton.whileHeld(new ClimbReverse());
		climbingClampInButton = new JoystickButton(rightJoystick,1);
		climbingClampInButton.whenPressed(new ClimbingClampEngage());
		climbingClampOutButton = new JoystickButton(rightJoystick, 1);
		climbingClampOutButton.whenReleased(new ClimbingClampDisengage());

		shootsorthighButton = new JoystickButton(rightJoystick, 6);
		shootsorthighButton.whileHeld(new MoveShooterDeflectorUp());
		shootsortlowButton = new JoystickButton(rightJoystick, 7);
		shootsortlowButton.whileHeld(new MoveShooterDeflectorDown());

		storagesorthighButton = new JoystickButton(leftJoystick, 11);
		storagesorthighButton.whileHeld(new MoveSortingDeflectorUp());
		storagesortlowButton = new JoystickButton(leftJoystick, 10);
		storagesortlowButton.whileHeld(new MoveSortingDeflectorDown());

		}
	
	public Joystick getLeftJoystick() { return leftJoystick; }
	public Joystick getRightJoystick() { return rightJoystick; }
	public Joystick getCoDrivingJoystick() { return coDrivingJoystick; }
	public double getClimbingSpeed() {return coDrivingJoystick.getAxis(Joystick.AxisType.kY);}
	
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

