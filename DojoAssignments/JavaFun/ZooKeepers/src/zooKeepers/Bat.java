package zooKeepers;

class Bat extends Mammal{
	Bat(){
		super();
		this.energyLevel = 300;
		}

	public void fly() {
		System.out.println("Wee, I fly to the sky");
		this.energyLevel =this.energyLevel -50;
		}
	public void eatHumans() {
		this.energyLevel =this.energyLevel +25;
	}
	public void attackTown() {
		System.out.printf("Oh no, car fire,everything fire,me fire\n");
		this.energyLevel =this.energyLevel -100;
	}
}
