package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.DifferentialDrive;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class DifferentialDriveArcade extends SubsystemBase {

    Telemetry telemetry;
    GamepadEx gamepad;

    Motor backRight;
    Motor backLeft;

    DifferentialDrive differentialDrive;

    public DifferentialDriveArcade(HardwareMap hardwareMap, GamepadEx gamepad, Telemetry telemetry) {
        this.gamepad = gamepad;
        this.telemetry = telemetry;

        this.backLeft = new Motor(hardwareMap, "BL");
        this.backRight = new Motor(hardwareMap, "BR");

        this.differentialDrive = new DifferentialDrive(backLeft, backRight);
    }

    @Override
    public void periodic() {
        super.periodic();

        differentialDrive.arcadeDrive(gamepad.getRightY(), -1 * gamepad.getRightX());
    }
}
