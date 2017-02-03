package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import javax.swing.*;

/**
 * Created by User on 2/2/2017.
 */
public class CloseandGoUp extends CommandGroup{
    public CloseandGoUp(){
        addSequential(new SetGearGrab());
        addSequential(new WaitCommand(1.5));
        addSequential(new SetClampUp());
    }

}
