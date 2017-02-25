package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc.team3546.robot.commands.*;

/**
 * Created by User on 2/25/2017.
 */
public class PlaceGearCenter extends CommandGroup{
    public PlaceGearCenter(){
        addSequential(new DriveTrainLowGear());
        addSequential(new SetClampUp());
        addSequential(new DriveStraight(3.5,false));
        addSequential(new SetGearRelease());
        addSequential(new WaitCommand(.25));
        addSequential(new DriveStraight(2, true));
        addSequential(new WaitCommand(.5));
        addSequential(new DriveTrainHighGear());
    }
}