package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 * Created by User on 1/28/2017.
 */
public class PrintPotentiometer extends InstantCommand {
    Potentiometer testPotentiometer = new AnalogPotentiometer(0, 360, 0);

    public PrintPotentiometer(){}

    public void initialize() {
        System.out.println(testPotentiometer.get());
        System.out.println("Printing Potentiometer");
    }
}