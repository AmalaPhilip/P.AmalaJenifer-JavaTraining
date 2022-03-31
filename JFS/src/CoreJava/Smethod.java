package CoreJava;

import java.util.Scanner;


class Smethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str1=sc.nextLine();
		System.out.println("Enter a string:");
		String str2=sc.nextLine();
		boolean result=str1.equals(str2);
		System.out.println("Strings are equal" + result);
		int length=str1.length();
		System.out.println("Length:"+length);
	
				

	}

}
