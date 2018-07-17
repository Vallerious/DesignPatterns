package structural.bridge.tvexample;

public class DVDDevice extends EntertainmentDevice {

	public DVDDevice(int newDeviceState, int newMaxSetting) {
		this.deviceState = newDeviceState;
		this.maxSetting = newMaxSetting;
	}

	@Override
	public void buttonFivePressed() {
		System.out.println("Chapter back");
		this.deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Chapter forward");
		this.deviceState++;
	}

}
