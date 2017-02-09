package org.usfirst.frc.team3546.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3546.robot.RobotMap;

/**
 * Created by User on 2/8/2017.
 */
public class LEDStrips extends Subsystem{
    protected void initDefaultCommand() {}

    private final Relay frontLedStripRelay = RobotMap.frontLEDStripRelay;
    private final Relay rearLedStripRelay = RobotMap.rearLEDStripRelay;

    public void turnOnFrontLEDStrip () {frontLedStripRelay.set(Relay.Value.kForward);}
    public void turnOffFrontLEDStrip () {frontLedStripRelay.set(Relay.Value.kOff);}

    public void turnOnRearLEDStrip () {rearLedStripRelay.set(Relay.Value.kForward);}
    public void turnOffRearLEDStrip () {rearLedStripRelay.set(Relay.Value.kOff);}
}
