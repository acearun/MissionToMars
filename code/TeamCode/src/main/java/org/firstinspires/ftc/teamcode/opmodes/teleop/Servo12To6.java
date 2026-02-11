package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.Servo12to6SubSystem;

@TeleOp
public class Servo12To6 extends OpModeTemplate {

    Servo12to6SubSystem servo12to6;

    @Override
    public void initialize() {
        super.initialize();

        this.servo12to6 = new Servo12to6SubSystem(hardwareMap, driverGamepad, telemetry);

        register(servo12to6);
    }

    @Override
    public void run() {
        super.run();

        driverGamepad.getGamepadButton(GamepadKeys.Button.DPAD_UP)
                .whenPressed(new InstantCommand(servo12to6::MoveTo12, servo12to6));

        driverGamepad.getGamepadButton(GamepadKeys.Button.DPAD_DOWN)
                .whenPressed(new InstantCommand(servo12to6::MoveTo6, servo12to6));

        driverGamepad.getGamepadButton(GamepadKeys.Button.DPAD_RIGHT)
                .whenPressed(new InstantCommand(servo12to6::MoveTo3, servo12to6));
    }
}
