package structural.bridge.tvexample;

// Abstraction layer - this class makes possible for the remote interface to work with different devices
public abstract class RemoteControl {
	private EntertainmentDevice entertainmentDevice;
	
	public RemoteControl(EntertainmentDevice entertainmentDevice) {
		this.entertainmentDevice = entertainmentDevice;
	}
	
	public void buttonFivePressed() {
	    // Here we are bridging the button press
		this.entertainmentDevice.buttonFivePressed();
	}
	
	public void buttonSixPressed() {
		this.entertainmentDevice.buttonSixPressed();
	}
	
	public void deviceFeedback() {
		this.entertainmentDevice.deviceFeedback();
	}
	
	/*
	 * We leave the varying method unimplemented
	 */
	public abstract void buttonNinePressed();
}
