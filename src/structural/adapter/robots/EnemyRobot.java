package structural.adapter.robots;

/**
 * Adaptee
 * 
 * @author valerivaleriev
 *
 */
public class EnemyRobot {
	public void smashWithHands() {
		System.out.println("Smash with hands smash smash!");
	}
	
	public void walkForward() {
		System.out.println("Walkie walk the walk../......");
	}
	
	public void reactToHuman(String driver) {
		System.out.println("HEY who are you we...!>!>!>!>>! " + driver);
	}
}
