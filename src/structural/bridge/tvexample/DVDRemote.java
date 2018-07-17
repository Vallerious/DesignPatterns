package structural.bridge.tvexample;

public class DVDRemote extends RemoteControl {

	public DVDRemote(EntertainmentDevice entertainmentDevice) {
		super(entertainmentDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("DVD was paused");
	}

}
