package org.usfirst.frc.team3546.robot.subsystems;

import org.usfirst.frc.team3546.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shifter extends Subsystem {

	private final DoubleSolenoid shifterPositionSolenoid = RobotMap.shifterPositionSolenoid;
	
	public static final DoubleSolenoid.Value LOW_GEAR = DoubleSolenoid.Value.kReverse;
	public static final DoubleSolenoid.Value HIGH_GEAR = DoubleSolenoid.Value.kForward;


public void setHighGear() { shifterPositionSolenoid.set(HIGH_GEAR); }

public void setLowGear() { shifterPositionSolenoid.set(LOW_GEAR); }


public void invertShifter() {
	if(shifterPositionSolenoid.get() == LOW_GEAR){
		shifterPositionSolenoid.set(HIGH_GEAR);
	}else{
		shifterPositionSolenoid.set(LOW_GEAR);
	}

}

//public DoubleSolenoid.Value getShifterPosition() { return shifterPositionSolenoid.get(); }

protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	
}

}