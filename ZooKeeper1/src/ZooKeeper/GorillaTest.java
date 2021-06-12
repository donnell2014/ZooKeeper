package ZooKeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		gorilla1.throwsomething();
		System.out.println(gorilla1.getEnergy());
		gorilla1.climb();
		System.out.println(gorilla1.getEnergy());
		gorilla1.eatBananas();
		System.out.println(gorilla1.getEnergy());

	}

}
