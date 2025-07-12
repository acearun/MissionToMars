package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class SingleMotorGamepadStickSystem extends SubsystemBase {

    Telemetry telemetry;
    GamepadEx gamepad;
    Motor motor;

    public SingleMotorGamepadStickSystem(HardwareMap hardwareMap, GamepadEx gamepad, Telemetry telemetry) {
        this.gamepad = gamepad;
        this.telemetry = telemetry;

        this.motor = new Motor(hardwareMap, "singleMotor");
    }

    @Override
    public void periodic() {
        super.periodic();

        motor.set(gamepad.getRightY());
    }
}
