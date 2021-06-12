package ZooKeeper;

public class Bat extends Mammal{
	
	public Bat() {
		this.energy = 300;
	}
	
	public void fly() {
		this.energy -= 50;
		System.out.println("The bats wings go whooosh and it takes off flying losing 50 energy.");
		
	}
	
	public void eathumans() {
		System.out.println("So... well, nevermind. Energy increases by 25.");
		this.energy += 25;
	}
	
	public void attacktown() {
		System.out.println("Crackling wood from the fire rings throughout the town as the bat goes on a rampage. Bat's energy decreases by 100.");
		this.energy -= 100;
	}

}
