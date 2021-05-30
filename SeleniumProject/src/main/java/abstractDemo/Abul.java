package abstractDemo;

public class Abul extends MobileUser{
	
	//Both call() and sendmassage() methods internally connected by Override
	
	@Override
	void sendmassage() {
		System.out.println("Abul is fully abstract and inherit from MobileUser ");
	}
}
