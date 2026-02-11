package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class SingleMotorGamepadButtonSystem extends SubsystemBase {

    Telemetry telemetry;
    GamepadEx gamepad;
    Motor motor;

    public SingleMotorGamepadButtonSystem(HardwareMap hardwareMap, GamepadEx gamepad, Telemetry telemetry) {
        this.gamepad = gamepad;
        this.telemetry = telemetry;

        this.motor = new Motor(hardwareMap, "singleMotor");
    }

    public void MoveMotorForward() {
        motor.set(0.5);
    }

    public void MoveMotorReverse() {
        motor.set(-0.5);
    }

    public void StopMotor() {
        motor.set(0);
    }

    @Override
    public void periodic() {
        super.periodic();
    }
}
