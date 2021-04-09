package objectMasterPartII;

class Ninja extends Human{
	Ninja(){
		super();
		this.stealth = 10;
		count++;
	}
	public void steal(Human human) {
		human.health = human.health- this.stealth;
		this.stealth = this.stealth + this.stealth;
	}
	public void runAway() {
		health = health-10;
	}
}
