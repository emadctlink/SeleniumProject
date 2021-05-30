package abstractDemo;

public class AbstractTest {

	public static void main(String[] args) {
	
	//we can't create of abstract class, but we can create reference variable
	// MobileUser mu = new MobileUser();
		
	MobileUser mu; //Reference  variable of super class
		
	mu= new Abul();
	mu.call();
	mu.sendmassage();
	
	mu= new Hashim();
	mu.call();
	mu.sendmassage();
	
	}

}
