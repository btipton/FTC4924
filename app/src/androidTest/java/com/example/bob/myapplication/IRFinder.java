package com.example.bob.myapplication;

import FTCCore.*;

/**
 * Created by Bob on 5/30/2015.
 */
public class IRFinder extends OpMode {

    DcMotor motorRight;
    DcMotor motorLeft;

    Servo claw;
    Servo wrist;

    @Override
    public void start() {
        motorRight = hardwareMap.dcMotor.get("right_motor");
        motorLeft = hardwareMap.dcMotor.get("left_motor");

        claw = hardwareMap.servo.get("claw_servo");
        wrist = hardwareMap.servo.get("wrist_servo");
    }

    @Override
    public void loop() {}

    @Override
    public void stop() {}

}
