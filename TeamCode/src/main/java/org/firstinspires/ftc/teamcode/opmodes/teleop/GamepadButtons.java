package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.SingleMotorGamepadButtonSystem;

@TeleOp
public class GamepadButtons extends OpModeTemplate {

    SingleMotorGamepadButtonSystem singleMotor;

    @Override
    public void initialize() {
        super.initialize();

        this.singleMotor = new SingleMotorGamepadButtonSystem(hardwareMap, driverGamepad, telemetry);

        register(singleMotor);
    }

    @Override
    public void run() {
        super.run();

        driverGamepad.getGamepadButton(GamepadKeys.Button.A)
                .whenPressed(new InstantCommand(singleMotor::MoveMotorForward, singleMotor))
                .whenReleased(new InstantCommand(singleMotor::StopMotor, singleMotor));

        driverGamepad.getGamepadButton(GamepadKeys.Button.X)
                .whenPressed(new InstantCommand(singleMotor::MoveMotorReverse, singleMotor))
                .whenReleased(new InstantCommand(singleMotor::StopMotor, singleMotor));
    }
}
