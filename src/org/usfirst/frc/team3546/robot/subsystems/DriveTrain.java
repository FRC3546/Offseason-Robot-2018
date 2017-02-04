package org.usfirst.frc.team3546.robot.subsystems;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc.team3546.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	private final RobotDrive driveTrainMotors = RobotMap.driveTrainMotors;

	public static boolean drivetraininvert = false;

	public void invertDriveTrain(){

		if(drivetraininvert == true){
			drivetraininvert = false;
		}else{
			drivetraininvert = true;
		}
	}

	public void ForwardDrive(){
		drivetraininvert = false;
	}

	public void ReverseDrive(){
		drivetraininvert = true;
	}

	protected void initDefaultCommand() {}

	//public void stop() {
		//driveTrainMotors.tankDrive(0, 0);
	//}

	public void setMotorOutputs(double motorleft, double motorright) {
		driveTrainMotors.tankDrive(motorleft, motorright);
	}

	public void setMotorOutputs(Joystick leftJoystick, Joystick rightJoystick) {

		if(drivetraininvert == false) {
			driveTrainMotors.tankDrive(leftJoystick, rightJoystick);
		}
		else{
			driveTrainMotors.tankDrive(-rightJoystick.getAxis(Joystick.AxisType.kY), -leftJoystick.getAxis(Joystick.AxisType.kY));
		}
	}
}

