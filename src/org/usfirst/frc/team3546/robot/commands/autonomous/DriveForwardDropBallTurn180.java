package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team3546.robot.commands.DriveTrainLowGear;
import org.usfirst.frc.team3546.robot.commands.DriveTrainHighGear;

/**
 * Created by User on 1/9/2017.
 */
public class DriveForwardDropBallTurn180 extends CommandGroup {
    public DriveForwardDropBallTurn180(){
        addSequential(new DriveForward());
        addSequential(new DriveTrainLowGear());
        //addSequential(new SweeperBarRotationOut(), 1);
        addSequential(new DriveTrainHighGear());
        addSequential(new Turn180());
        addSequential(new DriveForward());
        addSequential(new Turn180());
    }
    //don't print in here
}
