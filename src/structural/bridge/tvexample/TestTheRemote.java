package structural.bridge.tvexample;

public class TestTheRemote {

	public static void main(String[] args) {
		RemoteControl remoteControl = new TVRemoteControl(new TVDevice(0, 10));
		RemoteControl remoteControlPause = new DVDRemote(new DVDDevice(0, 100));
		 
		remoteControl.buttonFivePressed();
		remoteControl.buttonNinePressed();
		
		remoteControlPause.buttonFivePressed();
		remoteControlPause.buttonNinePressed();
		
		remoteControlPause.deviceFeedback();
	}

}
