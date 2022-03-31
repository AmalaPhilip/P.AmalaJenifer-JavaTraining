package java11;

public interface PrivateInterface {
	public abstract void abstractMethod();
	
	static void privateMethod(){
		System.out.println("inside private method");
	}
	public default void defaultMethod() {
		normalMethod();
		privateMethod();
		
	}
	public static void staticMethod() {
		privateMethod();
	}
	public static void normalMethod() {
		privateMethod();
	}
	

}
