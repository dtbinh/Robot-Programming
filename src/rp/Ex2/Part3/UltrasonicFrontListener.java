package rp.Ex2.Part3;

import lejos.nxt.UltrasonicSensor;

public class UltrasonicFrontListener extends UltrasonicListener {
	private WallApproachListener listener;

	public UltrasonicFrontListener(UltrasonicSensor sensor, WallApproachListener listener) {
		super(sensor, 2);
		this.listener = listener;
	}

	@Override
	public void stateChanged(int value, int oldValue) {
		if (oldValue - value > 0 && value < UltrasonicSideListener.TARGETDISTANCE) // if getting closer to wall
			listener.wallApproaching(value);
	}
}