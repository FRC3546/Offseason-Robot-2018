package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc.team3546.robot.commands.*;

/**
 * Created by User on 3/7/2017.
 */
public class Test extends CommandGroup {
    public Test(){
        addSequential(new DriveTrainHighGear());
        addSequential(new SetClampUp());
        addSequential(new DriveStraight(2.2, false));
        addSequential(new DriveAtAngle(-120, .25, .8));
        addSequential(new WaitCommand(.5));
        addSequential(new SetGearRelease());
        addSequential(new WaitCommand(.5));
        addSequential(new DriveStraight(1, true));
    }
}