package rp.Listener;

import lejos.nxt.UltrasonicSensor;

public class UltrasonicFrontListener extends UltrasonicDistanceListener {
	private final WallApproachListener listener;

	public UltrasonicFrontListener(UltrasonicSensor sensor, WallApproachListener listener) {
		super(sensor, 2);
		this.listener = listener;
	}

	@Override
	public void stateChanged(int value, int oldValue) {
		if (oldValue - value > 0 && value < InfraredSideListener.TARGETDISTANCE * 0.75) // if getting closer to wall
			this.listener.wallApproaching(value);
	}
}