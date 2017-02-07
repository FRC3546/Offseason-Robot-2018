package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 * Created by User on 2/6/2017.
 */
public class CloseandGoDown extends CommandGroup{
    public CloseandGoDown(){
        addSequential(new SetGearGrab());
        addSequential(new WaitCommand(1.5));
        addSequential(new SetClampDown());
    }
}
