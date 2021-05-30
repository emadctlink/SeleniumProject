package abstractDemo;

//its fully abstract class, because no abstract method
public abstract class MobileUser {

	//call is non abstract method
	void call() {
		System.out.println("call is non abstract method");
	}
	
	abstract void sendmassage(); //this is fully abstract method
}
