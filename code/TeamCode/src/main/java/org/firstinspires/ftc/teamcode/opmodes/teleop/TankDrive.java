package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.DifferentialDriveTank;

@TeleOp
public class TankDrive extends OpModeTemplate {

    DifferentialDriveTank tankDrive;

    @Override
    public void initialize() {
        super.initialize();

        this.tankDrive = new DifferentialDriveTank(hardwareMap, driverGamepad, telemetry);

        register(tankDrive);
    }
}
