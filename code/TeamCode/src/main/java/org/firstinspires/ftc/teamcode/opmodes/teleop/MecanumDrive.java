package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDrivetrain;

@TeleOp
public class MecanumDrive extends OpModeTemplate {

    MecanumDrivetrain drive;

    @Override
    public void initialize() {
        super.initialize();

        this.drive = new MecanumDrivetrain(hardwareMap, driverGamepad, telemetry);

        register(drive);
    }
}
