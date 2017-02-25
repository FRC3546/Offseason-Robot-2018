package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc.team3546.robot.commands.DriveStraight;
import org.usfirst.frc.team3546.robot.commands.DriveTrainLowGear;
import org.usfirst.frc.team3546.robot.commands.SetGearRelease;

/**
 * Created by User on 2/18/2017.
 */
public class DriveForwardStraight extends CommandGroup{
    public DriveForwardStraight(){
        //Drive Straight Power must be at 50%
        addSequential(new DriveTrainLowGear());
        addSequential(new DriveStraight(6,false));
        addSequential(new SetGearRelease());
        addSequential(new WaitCommand(.25));
        addSequential(new DriveStraight(4, true));
    }
}
