package structural.adapter.robots;
import java.util.Random;

public class EnemyTank implements EnemyAttacker {
	
	Random randomGenerator = new Random();

	@Override
	public void fireWeapon() {
		int attackDamage = randomGenerator.nextInt(10) + 1;
		
		System.err.println("Enemy attacked with " + attackDamage + " damage!");
	}

	@Override
	public void driveForward() {
		System.out.println("Toot toot driving forward!");
	}

	@Override
	public void assignDriver(String driver) {
		System.out.println("hey....who is driving the tank....oh its " + driver);
	}

}
