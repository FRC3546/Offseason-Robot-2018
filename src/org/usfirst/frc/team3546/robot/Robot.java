
package org.usfirst.frc.team3546.robot;


import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team3546.robot.commands.Drive;
import org.usfirst.frc.team3546.robot.commands.PrintPotentiometer;
import org.usfirst.frc.team3546.robot.commands.autonomous.BlueAlliancePlaceGearLeft;
import org.usfirst.frc.team3546.robot.commands.autonomous.BlueAlliancePlaceGearRight;
import org.usfirst.frc.team3546.robot.commands.autonomous.DoNothing;
import org.usfirst.frc.team3546.robot.commands.autonomous.PlaceGearCenter;
import org.usfirst.frc.team3546.robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory
 */
public class
Robot extends IterativeRobot {

	public static DriveTrain robotDriveTrain;
	public static OI oi;
	public static Shifter shifter;
	public static GearManipulation gearManipulation;
	public static Climbing climbing;
	public static Gyro gyro;
	public static Shooting shooting;
	public static BallSorting ballSorting;
	public static LEDStrips ledStrips;
	public static Camera camera;

           Command autonomousCommand;
           Command driveCommand;
           SendableChooser autoChooser;

           /**
            * This function is run when the robot is first started up and should be
            * used for any initialization code.
            */
        public void robotInit() {
            RobotMap.init();
            oi = new OI();
            robotDriveTrain = new DriveTrain();
            shifter = new Shifter();
            gearManipulation = new GearManipulation();
            climbing = new Climbing();
            gyro = new Gyro();
            shooting = new Shooting();
            ballSorting = new BallSorting();
            ledStrips = new LEDStrips();
            camera = new Camera();

            gyro.zeroYaw();

            //new Thread(() -> {
            //UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
            //camera.setResolution(360, 240);
            //camera.setFPS(8);
        //}).start();



        autoChooser = new SendableChooser();
        autoChooser.addObject("LEFT", new BlueAlliancePlaceGearLeft());
        autoChooser.addDefault("CENTER", new PlaceGearCenter());
        autoChooser.addObject("RIGHT", new BlueAlliancePlaceGearRight());
        autoChooser.addObject("Do Nothing", new DoNothing());
        SmartDashboard.putData("Auto mode", autoChooser);
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
        //autonomousCommand = (Command) chooser.getSelected();
        
		/* String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		switch(autoSelected) {
		case "My Auto":
			autonomousCommand = new MyAutoCommand();
			break;
		case "Default Auto":
		default:
			autonomousCommand = new ExampleCommand();
			break;
		} */
    	
    	// schedule the autonomous command (example)
        autonomousCommand = (Command) autoChooser.getSelected();
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        driveCommand = new Drive();
        driveCommand.start();
        PrintPotentiometer PrintPotentiometer = new PrintPotentiometer();
        PrintPotentiometer.start();

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler .getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
