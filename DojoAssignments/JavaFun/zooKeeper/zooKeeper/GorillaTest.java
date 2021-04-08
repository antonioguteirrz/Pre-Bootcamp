package zooKeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla test1 = new Gorilla();
		test1.throwSomething();
		test1.throwSomething();
		test1.throwSomething();
		test1.eatBanana();
		test1.eatBanana();
		test1.climb();
		
		System.out.println(test1.displayEnergy());
		
		
//She asks that you demonstrate that the class works as expected by having the 
//gorilla throw things 3 times, eat bananas twice and climb once; then print the 
//gorilla's energy level.
	}

}
