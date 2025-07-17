package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDrivetrainWithDirectionFlip;

@TeleOp
public class MecanumDriveWithDirectionFlip extends OpModeTemplate {

    MecanumDrivetrainWithDirectionFlip drive;

    @Override
    public void initialize() {
        super.initialize();

        this.drive = new MecanumDrivetrainWithDirectionFlip(hardwareMap, driverGamepad, telemetry);

        driverGamepad.getGamepadButton(GamepadKeys.Button.LEFT_STICK_BUTTON)
                .whenPressed(new InstantCommand(drive::ToggleDirection, drive));

        register(drive);
    }
}
