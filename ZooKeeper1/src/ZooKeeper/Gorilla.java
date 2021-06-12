package ZooKeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		
	}
	
	public void throwsomething() {
		this.energy -= 5;
		System.out.println("Gorilla throws something across the pin and losses 5 energy.");
	}
	
	public void eatBananas() {
		this.energy += 10;
		System.out.println("The gorilla is satified with the banana and gains 10 energy from it. ");
	}
	
	public void climb() {
		this.energy -= 10;
		System.out.println("the gorilla climbs the tree and decreases its energy by 10.");
	}
	

}
