package CoreJava;
import java.util.Scanner;
class liveInput
{
	public void IsEven(int a)
	{
		if(a%2==0)
			System.out.println(a+"is even");
		else
			System.out.println(a+"is odd");
	}
}

public class EvenOdd {

	public static void main(String[] args) {
		liveInput obj=new liveInput();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int var=sc.nextInt();
		String name=sc.nextLine();
		obj.IsEven(var);
		sc.close();

	}

}
