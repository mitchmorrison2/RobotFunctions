import rxtxrobot.*;

public class GetPing
{

	public static void main(String[] args)
	{
		int PING_PIN = 5;
		RXTXRobot r = new ArduinoNano(); // Create RXTXRobot object
		r.setPort("/dev/tty.usbmodem14101");
		r.connect();
		for (int x=0; x < 75; ++x)
		{
			//Read the ping sensor value, which is connected to pin 5
			//System.out.println("Response: " + r.getPing(PING_PIN) + " cm");
			if (r.getPing(PING_PIN) < 20) {
				System.out.print("X");
			} //end if
			else {
				System.out.print("0");
			}
			r.sleep(200);
			
			
		}
		
		
		r.close();
	}
}