package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.opmodes.OpModeTemplate;
import org.firstinspires.ftc.teamcode.subsystems.DifferentialDriveArcade;

@TeleOp
public class ArcadeDrive extends OpModeTemplate {

    DifferentialDriveArcade arcadeDrive;

    @Override
    public void initialize() {
        super.initialize();

        this.arcadeDrive = new DifferentialDriveArcade(hardwareMap, driverGamepad, telemetry);

        register(arcadeDrive);
    }
}
