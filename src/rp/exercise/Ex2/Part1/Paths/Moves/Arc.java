package rp.exercise.Ex2.Part1.Paths.Moves;

import rp.exercise.Ex2.Part1.Paths.Movement;

import lejos.robotics.navigation.DifferentialPilot;

public class Arc extends Movement {
	private final double angle, radius;

	public Arc(double angle, double radius) {
		super();
		this.angle = angle;
		this.radius = radius;
	}

	@Override
	protected void startMoving(DifferentialPilot pilot) {
		pilot.travelArc(angle, radius, true);
	}
}