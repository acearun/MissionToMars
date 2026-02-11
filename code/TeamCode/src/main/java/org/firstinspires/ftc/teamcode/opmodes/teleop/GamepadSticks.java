package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.SingleMotorGamepadStickSystem;

@TeleOp
public class GamepadSticks extends OpModeTemplate {

    SingleMotorGamepadStickSystem singleMotor;

    @Override
    public void initialize() {
        super.initialize();

        this.singleMotor = new SingleMotorGamepadStickSystem(hardwareMap, driverGamepad, telemetry);

        register(singleMotor);
    }

    @Override
    public void run() {
        super.run();
    }
}
