
import rxtxrobot.*;


public class MoveServo {
	
		public static void main(String[] args)
		{
			RXTXRobot r = new ArduinoNano(); // Create RXTXRobot object
			r.setPort("/dev/tty.usbmodem14101"); 
			r.setVerbose(true); // Turn on debugging messages
			r.connect();
			
			//Move 180 Servo on channel 0 to x degrees
			r.runPCAServo(0, 0);

			//Move Continuous Servo on channel 1 at 90 speed	
			//r.runPCAContServo(1, 90); 

			//Move 180 Servo on channel 2 to 50 degrees for 1000 milliseconds
			//r.runPCATimedServo(2, 50, 1000);
			//r.close();
		}
	}

