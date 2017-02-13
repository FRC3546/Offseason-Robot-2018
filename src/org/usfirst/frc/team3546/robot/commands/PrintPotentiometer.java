package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import org.usfirst.frc.team3546.robot.Robot;

/**
 * Created by User on 1/28/2017.
 */
public class PrintPotentiometer extends InstantCommand {

    public PrintPotentiometer(){}

    // Called just before this Command runs the first time
    protected void initialize() { System.out.println("Potentiometer Angle: " +
            Robot.shooting.getHighorLowShootingGuidePotentiometerAngle());}
}