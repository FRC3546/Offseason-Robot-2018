package org.usfirst.frc.team3546.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3546.robot.RobotMap;

import javax.security.auth.Subject;

/**
 * Created by User on 7/19/2017.
 */
public class TestMotorSubsystem extends Subsystem {

    protected void initDefaultCommand() {
        // TODO Auto-generated method stub
    }

        private final SpeedController demoMotor = RobotMap.demoMotor;
    private final SpeedController testMotor = RobotMap.testMotor;

    private double SPEED = -.8;

    public void spindemoMotorClockwise(){

        demoMotor.set(SPEED);
    }

    public void spinTestMotorClockwise(){
        testMotor.set(-SPEED*.7);
    }
    public void spindemoMotorCounterClockwise(){demoMotor.set(-SPEED);}


}
