package rp;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.RConsole;
import lejos.robotics.navigation.DifferentialPilot;

public class GeoffBot {
	// GeoffBot sizes
	private final static double WHEELDIAMETER = 6.45;
	private final static double TRACKWIDTH = 12.75; // Both in cm
	public static int LSThreshold = 70;
	public final static int LSLeftLow = 482, LSRightLow = 406, LSLeftHigh = 546, LSRightHigh = 469;

	private static DifferentialPilot diffPilot;

	// GeoffBot settings
	static {
		diffPilot = new DifferentialPilot(WHEELDIAMETER, TRACKWIDTH, Motor.B, Motor.C);
		diffPilot.setTravelSpeed(15);
		Bluetooth.setFriendlyName("GeoffBot");
	}

	public static DifferentialPilot getDifferentialPilot() {
		return diffPilot;
	}

	public static SensorPort getTouchPort() {
		return SensorPort.S4;
	}

	public static SensorPort getFrontUltrasonicPort() {
		return SensorPort.S2;
	}

	public static SensorPort getSideInfraredPort() {
		return SensorPort.S3;
	}

	public static SensorPort getLightSensorLeftPort() {
		return SensorPort.S4;
	}

	public static SensorPort getLightSensorRightPort() {
		return SensorPort.S3;
	}

	public static SensorPort getCameraPort() {
		return SensorPort.S1;
	}

	public static void calibrateLeftLS(LightSensor ls) {
		ls.setLow(LSLeftLow);
		ls.setHigh(LSLeftHigh);
	}

	public static void calibrateRightLS(LightSensor ls) {
		ls.setLow(LSRightLow);
		ls.setHigh(LSRightHigh);
	}

	// Return console output to PC
	public static void connectRemote() {
		RConsole.openAny(0);
		System.setOut(RConsole.getPrintStream());
		System.setErr(RConsole.getPrintStream());
	}
}