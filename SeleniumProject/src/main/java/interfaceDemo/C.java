package interfaceDemo;

public class C implements A,B{
	// multiple inheritance possible in interface , C inherit A,B
	// Here C is an Implementation Class
	// 1 class could have multiple interface like C has A,B
	// Class C is Non Abstract because there is no abstract keyword
	
	
	//inherit
	public void play() {
		System.out.println("We are playing interface");
	}
	public void football() {
		System.out.println("Who doesn't like football");
	}
	public void baseball() {
		System.out.println("we dont play baseball in Bangladesh");
	}
	public void chess() {
		System.out.println("Chess is interesting game");
	}
	
	public void cricket() {
		System.out.println("I like cricket");
	}
	public void Abstract() {
		System.out.println("Abstract and Interface are hard games");
	}
	
	
	
	// here all methods are non abstract because these has body or logic
	
}
