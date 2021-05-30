package seleniumDemo;

public class ClassMethod {

		public static void main(String[] args) {
			
		
			ClassMethod obj = new ClassMethod();
			obj.dog(); //public
			obj.deer(); //private
			obj.tiger(); //default
			obj.bird(); //protected
			obj.sum("Dove", " Eagle", 30); //return type
			obj.fruits("Apple"," Banana");//non static parameterized
			
			veg("Cucumber"," Dragon fruit");//static parameterized
			lion(); //static-   Static to Static we don't need to create an object, 
			//only the method name to be call.
			
		}
		//public method can accessible from other class as well but same package and.++
		public void dog() {
			System.out.println("Everybody like Dog");	
		}
		
		//private method can accessible from within (same/declared) class only.
		private void deer() {
			System.out.println("My son loves deer");
		}
		
		//Default method can accessible within the package only.
		void tiger() {
			System.out.println("Everybody know about Tiger");
		}
		
		//protected method can accessible from other class as well but same package.
		protected void bird() {
			System.out.println("Duel is our national Bird");
		}
		
		
		
		//return type method. value should declare in main static method.
		//syntex was public void sum(). Now its public String sum, because of String value.
		public String sum(String a, String b, int x) {
			System.out.println(a+b);
			return a+b+x;
		}
		 
		//static parameterized method
		public static void veg(String C, String D) {
			System.out.println(C+D);
		}
		
		//non static parameterized method. should create an object in main static method. 
		public void fruits(String A, String B) {
			System.out.println(A + B);
		}
		//static method outside of main static method
		public static void lion() {
			System.out.println("Lion is the King of Animal");
		}
		
		
	}