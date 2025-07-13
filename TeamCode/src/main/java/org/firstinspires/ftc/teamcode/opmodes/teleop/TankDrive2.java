package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.DifferentialDriveTank2;

@TeleOp
public class TankDrive2 extends OpModeTemplate {

    DifferentialDriveTank2 tankDrive;

    @Override
    public void initialize() {
        super.initialize();

        this.tankDrive = new DifferentialDriveTank2(hardwareMap, driverGamepad, telemetry);

        register(tankDrive);
    }
}
