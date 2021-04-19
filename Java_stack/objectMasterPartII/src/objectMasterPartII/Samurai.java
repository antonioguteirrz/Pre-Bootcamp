package objectMasterPartII;

class Samurai extends Human{
	
	Samurai(){
		super();
		this.health = 200;
		count++;
		
	}
	public void deathBlow(Human human) {
		human.health = 0;
		this.health =this.health/2;
	}
	public void meditate() {
		int heal = this.health/2;
		this.health = this.health +heal;
	}
	public int howMany() {
		return count;
	}
}
