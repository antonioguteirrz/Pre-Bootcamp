package objectMasterPartII;


public class Human {

protected int strength;
protected int stealth;
protected int intelligence;
protected int health;
protected static int count;


public int getStrength() {
	return strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}
public int getStealth() {
	return stealth;
}
public void setStealth(int stealth) {
	this.stealth = stealth;
}
public int getIntelligence() {
	return intelligence;
}
public void setIntelligence(int intelligence) {
	this.intelligence = intelligence;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}

Human(){
	this.strength = 3;
	this.stealth=3;
	this.intelligence=3;
	this.health=100;	
}
public int attack(Human human){
	human.health = human.health - strength;
	return human.health;
}
}

