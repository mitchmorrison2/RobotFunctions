
import rxtxrobot.*;

public class RunMotor {
	
	public static RXTXRobot robot = new ArduinoUno();
	
	private static int CHANNEL_LEFT_WHEEL = 2;
	private static int CHANNEL_RIGHT_WHEEL = 1;
	
	public static void runForward(int time) {
		int speedLeft = 325; 
		int speedRight = -100;
		
		robot.runTwoPCAMotor(CHANNEL_LEFT_WHEEL, speedLeft, CHANNEL_RIGHT_WHEEL, speedRight, time);
	}
		
	public static void upSlope(int time) {
		int speedLeft = 500; 
		int speedRight = -350;
		
		robot.runTwoPCAMotor(CHANNEL_LEFT_WHEEL, speedLeft, CHANNEL_RIGHT_WHEEL, speedRight, time);
	}
	
	public static void turnLeft(int time) {
		int speedLeft = -60;
		int speedRight = -60;
		
		robot.runTwoPCAMotor(CHANNEL_LEFT_WHEEL, speedLeft, CHANNEL_RIGHT_WHEEL, speedRight, time);
	}
	
	public static void turnRight(int time) {
		int speedLeft = 260;
		int speedRight = 260;
		
		robot.runTwoPCAMotor(CHANNEL_LEFT_WHEEL, speedLeft, CHANNEL_RIGHT_WHEEL, speedRight, time);
	}
	
	public static void main(String[] args) {
		robot.setPort("/dev/tty.usbmodem14101");
		robot.connect();

		//runForward(3000);
		upSlope(3000);
		
		//robot.sleep(3000);
		//turnLeft(420);
		//robot.sleep(2000);
		//turnRight(700);
		
		robot.close();
	}
}