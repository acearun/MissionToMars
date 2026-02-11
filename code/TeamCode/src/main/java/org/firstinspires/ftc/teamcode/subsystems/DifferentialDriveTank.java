package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class DifferentialDriveTank extends SubsystemBase {

    Telemetry telemetry;
    GamepadEx gamepad;

    Motor backRight;
    Motor backLeft;

    public DifferentialDriveTank(HardwareMap hardwareMap, GamepadEx gamepad, Telemetry telemetry) {
        this.gamepad = gamepad;
        this.telemetry = telemetry;

        this.backLeft = new Motor(hardwareMap, "BL");
        this.backRight = new Motor(hardwareMap, "BR");
    }

    @Override
    public void periodic() {
        super.periodic();

        backLeft.set(-1 * gamepad.getLeftY());
        backRight.set(-1 * gamepad.getRightY());
    }
}
