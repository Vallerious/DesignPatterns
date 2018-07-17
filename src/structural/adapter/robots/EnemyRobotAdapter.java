package structural.adapter.robots;

public class EnemyRobotAdapter implements EnemyAttacker {
	
	private EnemyRobot enemyRobot;
	
	// We are basically mapping the methods of the adaptee to the interface that it has to comply to
	public EnemyRobotAdapter(EnemyRobot enemyRobot) {
		this.enemyRobot = enemyRobot;
	}

	@Override
	public void fireWeapon() {
		this.enemyRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		this.enemyRobot.walkForward();
	}

	@Override
	public void assignDriver(String driver) {
		this.enemyRobot.reactToHuman(driver);
	}

}
