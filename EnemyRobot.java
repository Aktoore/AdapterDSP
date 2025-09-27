import java.util.Random;

public class EnemyRobot {
    Random rand = new Random();

    public void smashWithHands() {
        int attackDamage = rand.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + "Damage With Its HAnds");
    }

    public void walkForward() {
        int movement = rand.nextInt(5) + 1;

        System.out.println("Enemy Robot Walks Forward " + movement + "Spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Reacts To Human " + driverName);

    }
}
