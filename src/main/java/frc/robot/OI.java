// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

/** Add your docs here. */
public class OI {

XboxController driverController = new XboxController(RobotMap.DRIVER_CONTROLLER);

public double GetDriverRawAxis(int axis)
{
    return driverController.getRawAxis(axis);
}









}
