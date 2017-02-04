package org.usfirst.frc.team3546.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static RobotDrive driveTrainMotors;
	public static SpeedController drivetrainBackRightMotor;
	public static SpeedController drivetrainBackLeftMotor;
	public static SpeedController drivetrainFrontRightMotor;
	public static SpeedController drivetrainFrontLeftMotor;
	public static DoubleSolenoid shifterPositionSolenoid;
	public static DoubleSolenoid clampPositionSolenoid;
	public static DoubleSolenoid gearGrabSolenoid;
	public static Potentiometer shootingorStorageGuidePotentiometer;
	public static Potentiometer highorLowShootingGuidePotentiometer;
	public static SpeedController climbingMotor;
	public static SpeedController highorLowShootingGuideMotor;
	public static SpeedController rearShootingandIntakeMotor;
	public static SpeedController frontShootingMotor;
	public static SpeedController frontIntakeandStorageMotor;
	public static Encoder rearShootingandIntakeEncoder;
	public static Encoder frontShootingEncoder;

	public static Encoder drivetrainRightDrivetrainEncoder;
	public static Encoder drivetrainLeftDrivetrainEncoder;
	
	public static void init(){
		
		//SpeedController frontLeftMotor = new VictorSP(3);
		//SpeedController frontRightMotor = new VictorSP(2);
		//SpeedController backLeftMotor = new VictorSP(1);
		//SpeedController backRightMotor = new VictorSP(0);

		shootingorStorageGuidePotentiometer = new AnalogPotentiometer(0,360,0);
		highorLowShootingGuidePotentiometer = new AnalogPotentiometer(1,360,0);

		rearShootingandIntakeEncoder = new Encoder(0,1, false);
		frontShootingEncoder = new Encoder(2,3,false);


		SpeedController frontLeftMotor = new Jaguar(3);
		SpeedController frontRightMotor = new Jaguar(2);
		SpeedController backLeftMotor = new Jaguar(1);
		SpeedController backRightMotor = new Jaguar(0);

		SpeedController climbingMotor = new VictorSP(4);
		SpeedController highorLowShootingGuideMotor = new VictorSP(5);
		SpeedController frontIntakeandStorageMotor = new VictorSP(6);

		SpeedController rearShootingandIntakeMotor = new TalonSRX(0);
		SpeedController frontShootingMotor = new TalonSRX(1);

		driveTrainMotors = new RobotDrive(frontLeftMotor, backLeftMotor, frontRightMotor, backRightMotor);

		driveTrainMotors.setSafetyEnabled(false);
		driveTrainMotors.setExpiration(.1);
		driveTrainMotors.setSensitivity(50);

		driveTrainMotors.setMaxOutput(1);

		//inverts the direction of all motors
		//driveTrainMotors.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		//driveTrainMotors.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		//driveTrainMotors.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		//driveTrainMotors.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

		shifterPositionSolenoid = new DoubleSolenoid(0, 0, 1);
		clampPositionSolenoid = new DoubleSolenoid(0, 2, 3);
		gearGrabSolenoid = new DoubleSolenoid(0, 4, 5);
		
		
	}
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
