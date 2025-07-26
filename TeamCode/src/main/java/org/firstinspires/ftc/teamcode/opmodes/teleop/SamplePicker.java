package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDrivetrain;
import org.firstinspires.ftc.teamcode.subsystems.ServoArmSubsystem;

@TeleOp
public class SamplePicker extends OpModeTemplate {

    MecanumDrivetrain drive;
    ServoArmSubsystem arm;

    @Override
    public void initialize() {
        super.initialize();

        this.drive = new MecanumDrivetrain(hardwareMap, driverGamepad, telemetry);
        this.arm = new ServoArmSubsystem(hardwareMap, driverGamepad, telemetry);

        register(drive, arm);
    }

    @Override
    public void run() {
        super.run();

        driverGamepad.getGamepadButton(GamepadKeys.Button.A)
                .whenPressed(new InstantCommand(arm::LiftArm, arm));

        driverGamepad.getGamepadButton(GamepadKeys.Button.X)
                .whenPressed(new InstantCommand(arm::DropArm, arm));

        driverGamepad.getGamepadButton(GamepadKeys.Button.Y)
                .whenPressed(new InstantCommand(arm::OpenClaw, arm));

        driverGamepad.getGamepadButton(GamepadKeys.Button.B)
                .whenPressed(new InstantCommand(arm::CloseClaw, arm));
    }
}
