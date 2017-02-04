package org.usfirst.frc.team3546.robot.subsystems;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import org.usfirst.frc.team3546.robot.RobotMap;

/**
 * Created by User on 2/3/2017.
 */
public class BallSorting extends Subsystem {

    protected void initDefaultCommand() {}

    public static final double SHOOTING_OR_STORAGE_GUIDE_MOTOR_PID_P = .1;
    public static final double SHOOTING_OR_STORAGE_GUIDE_MOTOR_PID_I = 0;
    public static final double SHOOTING_OR_STORAGE_GUIDE_MOTOR_PID_D = 0;

    public static final double HIGH_DEGREE_VALUE = 1000;
    public static final double LOW_DEGREE_VALUE = 1040;

    private PIDController shootingOrStorageGuideMotorPIDController;
    public BallSorting(){
        shootingOrStorageGuideMotorPIDController = new PIDController(
                SHOOTING_OR_STORAGE_GUIDE_MOTOR_PID_P,
                SHOOTING_OR_STORAGE_GUIDE_MOTOR_PID_I,
                SHOOTING_OR_STORAGE_GUIDE_MOTOR_PID_D,
                shootingorStorageGuidePotentiometer,
                shootingorStorageGuideMotor);
    }

    public void setShootingOrStoragePosition (double position){
        shootingOrStorageGuideMotorPIDController.setSetpoint(position);
        shootingOrStorageGuideMotorPIDController.enable();
    }

    public void setSortHigh(){
        setShootingOrStoragePosition(HIGH_DEGREE_VALUE);
    }
    public void setSortLow(){
        setShootingOrStoragePosition(LOW_DEGREE_VALUE);
    }


    private static Potentiometer shootingorStorageGuidePotentiometer = RobotMap.shootingorStorageGuidePotentiometer;
    public double getShootingorStorageGuidePotentiometerAngle(){
        return shootingorStorageGuidePotentiometer.get();
    }

    private SpeedController shootingorStorageGuideMotor = RobotMap.shootingorStorageGuideMotor;

    private final SpeedController frontIntakeandStorageMotor = RobotMap.frontIntakeandStorageMotor;

    public static final double FRONT_INTAKE_AND_STORAGE_MOTOR_SPEED = 1;

    public void spinFrontIntakeandStorageMotorClockwise(){frontIntakeandStorageMotor.set(FRONT_INTAKE_AND_STORAGE_MOTOR_SPEED);}

    public void spinFrontIntakeandStorageMotorCounterClockwise(){frontIntakeandStorageMotor.set(-FRONT_INTAKE_AND_STORAGE_MOTOR_SPEED);}

    public void spinFrontIntakeandStorageMotorOff(){frontIntakeandStorageMotor.set(0);}

    public void climbingMotorOff(){climbingMotorOff();}
}

