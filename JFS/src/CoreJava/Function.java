package CoreJava;

public class Function {

	
		// TODO Auto-generated method stub
		public static int addition(int a,int b)
		{
			return(a+b);
		}
		
			public static int subtraction(int a,int b)
			{
				return(a-b);
			}
			public static int multiplication(int a,int b)
			{
				return(a*b);
			}
			public static int division(int a,int b)
			{
				return(a/b);
			}
			public static void main(String[] args)
			{
				int res=addition(8,4);
				System.out.println("result is"+res);
			int add=addition(8,4);
			int sub=subtraction(8,4);
			int mul=multiplication(8,4);
			int div=division(8,4);
			System.out.println(add); 
			System.out.println(sub); 
			System.out.println(mul); 
			System.out.println(div); 
			
		}
		
	
	}


