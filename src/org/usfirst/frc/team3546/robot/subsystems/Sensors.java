package org.usfirst.frc.team3546.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import org.usfirst.frc.team3546.robot.RobotMap;

/**
 * Created by User on 1/30/2017.
 */
public class Sensors extends Subsystem{

    @Override
    protected void initDefaultCommand() {

    }

    private static Potentiometer testPotentiometer = RobotMap.testPotentiometer;

    public double getAngle(){
        return testPotentiometer.get();
    }



}
