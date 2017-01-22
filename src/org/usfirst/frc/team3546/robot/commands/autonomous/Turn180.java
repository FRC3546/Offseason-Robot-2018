package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3546.robot.Robot;

/**
 * Created by User on 1/9/2017.
 */
public class Turn180 extends Command {

    protected void initialize() {

    }


    protected void execute() {
        Robot.robotDriveTrain.setMotorOutputs(-.75, .75);
    }


    protected boolean isFinished() {
        if(timeSinceInitialized() > 1.6) {
            return true;
        }else{
            return false;
        }
    }


    protected void end() {
        Robot.robotDriveTrain.stop();

    }


    protected void interrupted() {
        end();

    }
}