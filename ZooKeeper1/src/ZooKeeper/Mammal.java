package ZooKeeper;

public class Mammal {
	protected int energy;


	public Mammal() {
		this.energy = 100;
	}


	public int getEnergy() {
		
		return energy;
	}


	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public String displayEnergy() {
		String result = "Current energy is:" + this.energy;
		return result;
	}
}