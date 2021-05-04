package objectMasterPartII;


public class HumanTest {
	public static void main(String[] args) {
		Wizard new_wizard =new Wizard();
		Ninja new_ninja = new Ninja();
		Ninja other_ninja = new Ninja();
		
		Samurai new_samurai = new Samurai();
		Samurai other_samurai = new Samurai();
		new_samurai.deathBlow(new_ninja);
		new_samurai.meditate();
		System.out.println(new_samurai.getHealth());
		System.out.println(new_ninja.getHealth());
		System.out.println(other_samurai.howMany());
		
	}

}
