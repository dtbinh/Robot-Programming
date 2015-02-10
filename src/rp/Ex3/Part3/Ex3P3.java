package rp.Ex3.Part3;

import rp.GeoffBot;
import lejos.nxt.Button;
import lejos.nxt.addon.NXTCam;
import lejos.util.Delay;

public class Ex3P3 {

	public void run(){
		NXTCam cam = new NXTCam(GeoffBot.getCameraPort());
		cam.setTrackingMode(NXTCam.COLOR);
		cam.sortBy(NXTCam.SIZE);
		cam.enableTracking(true);
		
		while (!Button.ESCAPE.isDown()){
			int numberOfObjects = cam.getNumberOfObjects();
			System.out.println(numberOfObjects);
			Delay.msDelay(300);
		}
	}
	public static void main(String[] args) {
		Ex3P3 program = new Ex3P3();
		program.run();

	}

}