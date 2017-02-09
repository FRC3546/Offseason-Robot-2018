package org.usfirst.frc.team3546.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3546.robot.RobotMap;

/**
 * Created by User on 2/2/2017.
 */
public class Climbing extends Subsystem{

    protected void initDefaultCommand() {}

    private final SpeedController climbingMotor = RobotMap.climbingMotor;

    public static final double CLIMBING_SPEED = .5;

    public void climbingMotorClimb(){climbingMotor.set(CLIMBING_SPEED);}

    public void climbingMotorOff(){climbingMotorOff();}
}