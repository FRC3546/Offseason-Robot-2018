package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc.team3546.robot.commands.*;

/**
 * Created by User on 2/25/2017.
 */
public class RedAlliancePlaceGearRight extends CommandGroup{
    public RedAlliancePlaceGearRight(){
        addSequential(new DriveTrainHighGear());
        addSequential(new SetClampUp());
        addSequential(new DriveStraight(2, false));
        addSequential(new DriveAtAngle(-120, .25, 1.85));
        addSequential(new WaitCommand(.5));
        addSequential(new SetGearRelease());
        addSequential(new WaitCommand(.5));
        addSequential(new DriveStraight(1, true));
        addSequential(new WaitCommand(.5));
        addSequential(new DriveAtAngle(120, .25, 1.1));
        addSequential(new DriveStraight(2, false));
    }
}