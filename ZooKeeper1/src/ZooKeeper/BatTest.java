package ZooKeeper;

public class BatTest {

	public static void main(String[] args) {
		Bat bat1 = new Bat();
		System.out.println(bat1.displayEnergy());
		bat1.fly();
		System.out.println(bat1.displayEnergy());
		bat1.eathumans();
		System.out.println(bat1.displayEnergy());
		bat1.fly();
		System.out.println(bat1.displayEnergy());
		bat1.eathumans();
		System.out.println(bat1.displayEnergy());
		bat1.attacktown();
		System.out.println(bat1.displayEnergy());
		bat1.attacktown();
		System.out.println(bat1.displayEnergy());
		bat1.attacktown();
		System.out.println(bat1.displayEnergy());
		
		

	}

}
