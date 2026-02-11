package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class ServoArmSubsystem extends SubsystemBase {

    Telemetry telemetry;
    GamepadEx gamepad;

    Servo arm, claw;

    public ServoArmSubsystem(HardwareMap hardwareMap, GamepadEx gamepad, Telemetry telemetry) {
        this.gamepad = gamepad;
        this.telemetry = telemetry;

        this.arm = hardwareMap.get(Servo.class, "arm");
        this.claw = hardwareMap.get(Servo.class, "claw");
    }

    public void LiftArm() {
        arm.setPosition(0.0);
    }

    public void DropArm() {
        arm.setPosition(1.0);
    }

    public void OpenClaw() {
        claw.setPosition(0.0);
    }

    public void CloseClaw() {
        claw.setPosition(1.0);
    }


}
