package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import org.usfirst.frc.team3546.robot.Robot;

/**
 * Created by User on 2/2/2017.
 */
public class SetGearRelease extends InstantCommand{
    public SetGearRelease() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.gearManipulation.setGearRelease();
        Robot.ledStrips.turnOffFrontLEDStrip();
    }
}
