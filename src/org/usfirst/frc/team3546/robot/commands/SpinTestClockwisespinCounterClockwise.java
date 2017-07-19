package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import org.usfirst.frc.team3546.robot.Robot;

/**
 * Created by User on 7/19/2017.
 */
public class SpinTestClockwisespinCounterClockwise extends InstantCommand{

    public SpinTestClockwisespinCounterClockwise() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.testMotorSubsystem.spindemoMotorClockwise();
        Robot.testMotorSubsystem.spinTestMotorClockwise();
    }
}

