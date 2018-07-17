package structural.adapter.robots;

public class TestRobots {

	public static void main(String[] args) {
		EnemyTank tank = new EnemyTank();
		
		tank.assignDriver("Pesho");
		tank.driveForward();
		tank.fireWeapon();
		
		// Here we are adapting the incompatible enemyRobot to the enemyattacker interface and we can work with it the 
		// same way as with EnemyAttacker, they do not have relation to one another
		/*
		 * Lets say that the old interface is enemyRobot...we are adapting it to the new enemy attacker
		 * Interface without the need to modify any of the two.
		 */
		EnemyAttacker robot = new EnemyRobotAdapter(new EnemyRobot());
		
		robot.assignDriver("Pesho");
		robot.driveForward();
		robot.fireWeapon();
	}

}
