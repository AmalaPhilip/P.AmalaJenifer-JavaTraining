package java11;

public class privateMethodsInterface implements PrivateInterface{
	public void abstractMethod() {
		System.out.println("inside abstract method");
	}
	public static void main(String[] args) {
		privateMethodsInterface obj=new privateMethodsInterface();
		obj.abstractMethod();
		obj.defaultMethod();
		PrivateInterface.staticMethod();
		
	}

}
