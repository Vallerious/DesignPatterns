package structural.bridge.tvexample;

/**
 * Tests the example of bridge pattern
 * 
 * @author valerivaleriev
 *
 */
public class TestTheRemote {

	public static void main(String[] args) {
	    /*
	     * Here the RemoteControl interface is the 'bridge'.
	     * We can swap different RemoteControls and EntertainmentDevice.
	     * 
	     * The devices react a different way on button clicks but we proxy to the correct method
	     * of the device.
	     */
		RemoteControl remoteControl = new TVRemoteControl(new TVDevice(0, 10));
		RemoteControl remoteControlPause = new DVDRemote(new DVDDevice(0, 100));
		 
		remoteControl.buttonFivePressed();
		remoteControl.buttonNinePressed();
		
		remoteControlPause.buttonFivePressed();
		remoteControlPause.buttonNinePressed();
		
		remoteControlPause.deviceFeedback();
	}

}
