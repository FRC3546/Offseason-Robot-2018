package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3546.robot.Robot;

/**
 * Created by User on 2/3/2017.
 */
public class ZeroYaw extends Command {
    private boolean flipped;

    public ZeroYaw(){
        this.flipped = false;
    }

    public ZeroYaw(boolean flipped){
        this.flipped = flipped;
    }

    protected void initialize(){
        if (!flipped) Robot.gyro.zeroYaw();
        else Robot.gyro.zeroYawTo180();
    }
    protected boolean isFinished() {
        return false;
    }
}
