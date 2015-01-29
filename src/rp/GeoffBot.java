package rp;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.RConsole;
import lejos.robotics.navigation.DifferentialPilot;

public class GeoffBot {
	// GeoffBot sizes
	public final static double WHEELDIAMETER = 6.75, TRACKWIDTH = 16.5; // Both in cm

	private static DifferentialPilot diffPilot;

	//GeoffBot settings
	static {
		diffPilot = new DifferentialPilot(WHEELDIAMETER, TRACKWIDTH, Motor.B, Motor.C);
		diffPilot.setTravelSpeed(20);
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

	// Return console output to PC
	public static void connectRemote() {
		RConsole.openAny(0);
		System.setOut(RConsole.getPrintStream());
		System.setErr(RConsole.getPrintStream());
	}
}