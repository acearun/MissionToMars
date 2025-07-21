package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Servo12to6SubSystem extends SubsystemBase {

    @Config
    public static class Servo12to6 {

        public static double ServoMid = 0.5;
    }

    Telemetry telemetry;
    GamepadEx gamepad;

    Servo servo;

    public Servo12to6SubSystem(HardwareMap hardwareMap, GamepadEx gamepad, Telemetry telemetry) {
        this.gamepad = gamepad;
        this.telemetry = telemetry;

        this.servo = hardwareMap.get(Servo.class, "servo");
    }

    public void MoveTo12() {
        servo.setPosition(0.0);
    }

    public void MoveTo6() {
        servo.setPosition(1.0);
    }

    public void MoveTo3() {
        servo.setPosition(Servo12to6.ServoMid);
    }
}
