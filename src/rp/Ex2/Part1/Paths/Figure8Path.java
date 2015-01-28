package rp.Ex2.Part1.Paths;

import lejos.robotics.navigation.DifferentialPilot;

import rp.Ex2.Part1.Paths.Moves.Arc;
import rp.Ex2.Part1.Paths.Moves.Forward;

public class Figure8Path extends MovementPath {
	public Figure8Path(DifferentialPilot pilot) {
		super(pilot, "Figure of Eight", new Movement[] {
				new Forward(pilot, 20), new Arc(pilot, 270, 10), new Forward(pilot, 20), new Arc(pilot, -270, -10)
		});
	}
}