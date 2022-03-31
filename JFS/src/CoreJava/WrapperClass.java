package CoreJava;

public class WrapperClass {
	public static void main(String args[]) {
		int a=500;
		Integer b=2;
		Integer c=a;
		System.out.println(a+" "+b+" "+c);
		System.out.println(b.SIZE);
		System.out.println(c.compare(a,c));
		System.out.println(c.min(c, a));
		System.out.println(b.toBinaryString(b));
	
		
	}

}
