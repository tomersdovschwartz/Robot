// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TankDrive extends CommandBase {
  /** Creates a new TankDrive. */
  public TankDrive() {
    addRequirements(Robot.driverTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_STICK_Y);
    double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.RIGHT_STICK_Y);

    Robot.driverTrain.setLeftMotors(leftStickY);
    Robot.driverTrain.setRightMotors(rightStickY);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.driverTrain.setLeftMotors(0);
    Robot.driverTrain.setRightMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
