package org.usfirst.frc.team3546.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3546.robot.RobotMap;

/**
 * Created by User on 2/2/2017.
 */
public class GearManipulation extends Subsystem{

    protected void initDefaultCommand() {}

    private final DoubleSolenoid clampPositionSolenoid = RobotMap.clampPositionSolenoid;

        public void setClampDown() { clampPositionSolenoid.set(DoubleSolenoid.Value.kReverse);}
        public void setClampUp() { clampPositionSolenoid.set(DoubleSolenoid.Value.kForward);}

    private final DoubleSolenoid gearGrabSolenoid = RobotMap.gearGrabSolenoid;

        public void setGearGrab() { gearGrabSolenoid.set(DoubleSolenoid.Value.kReverse);}
        public void setGearRelease() { gearGrabSolenoid.set(DoubleSolenoid.Value.kForward);}

    public boolean isClampClosed(){ return clampPositionSolenoid.get() == DoubleSolenoid.Value.kReverse;}

}