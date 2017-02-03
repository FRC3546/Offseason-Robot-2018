package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 * Created by User on 2/2/2017.
 */
public class DownandStayClosed extends CommandGroup{
    public DownandStayClosed(){
        addSequential(new SetGearGrab());
        addSequential(new WaitCommand(1));
        addSequential(new SetClampDown());
    }
}
