package org.usfirst.frc.team3546.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import org.usfirst.frc.team3546.robot.RobotMap;
import sun.net.www.content.text.PlainTextInputStream;

/**
 * Created by User on 1/30/2017.
 */
public class Sensors extends Subsystem{

    @Override
    protected void initDefaultCommand() {}

    private static Potentiometer shootingorStorageGuidePotentiometer = RobotMap.shootingorStorageGuidePotentiometer;
    public double getShootingorStorageGuidePotentiometerAngle(){
        return shootingorStorageGuidePotentiometer.get();
    }

    private static Potentiometer highorLowShootingGuidePotentiometer = RobotMap.highorLowShootingGuidePotentiometer;
    public double getHighorLowShootingGuidePotentiometerAngle() {return highorLowShootingGuidePotentiometer.get();}



}
