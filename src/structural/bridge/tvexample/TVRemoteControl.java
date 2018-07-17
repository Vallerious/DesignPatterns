package structural.bridge.tvexample;

// Refined abstraction
public class TVRemoteControl extends RemoteControl {

	public TVRemoteControl(EntertainmentDevice entertainmentDevice) {
		super(entertainmentDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("The TV was muted");
	}

}
