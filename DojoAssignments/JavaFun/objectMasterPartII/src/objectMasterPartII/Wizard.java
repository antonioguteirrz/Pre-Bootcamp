package objectMasterPartII;

class Wizard extends Human{
	Wizard(){
		super();
		this.health = 50;
		this.intelligence = 8;
	}

	public void heal(Human human) {
		human.health = human.health + this.intelligence;
	}
	public void fireball(Human human) {
		int intelligenceIII = this.intelligence*3;
		human.health = human.health - intelligenceIII;
	}
}
