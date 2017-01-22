package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3546.robot.Robot;

/**
 * Created by Wobot on 12/20/2016.
 */
public class DriveForward extends Command{

    protected void initialize() {

    }


    protected void execute() {
        Robot.robotDriveTrain.setMotorOutputs(-.75, -.75);
    }


    protected boolean isFinished() {
        if(timeSinceInitialized() > 2) {
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

