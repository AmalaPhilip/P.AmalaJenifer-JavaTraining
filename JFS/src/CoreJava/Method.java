package CoreJava;

public class Method {
	private static final int Multiple = 0;
	public static String DecisionMaking(int a)
	{
	if(a%4 == 0 && a%100 != 0 || a%400 == 0 )
	{
	return(a + "is a leap year.");
	}
	else
	{
	return(a + "is not a leap year.");
	}
	}
	public static char Word(char S)
	{
		return (S);
	}
	public static int Multiple(int N)
	{
		for(int i=1;i<=N;i++)
		{
			int res=2*i;
			return(res);
		}
		return N;
	}
	public static int Relational(int c,int d)
	{
	    if(c>d)
	    {
	    	return(c);
	    }
	    else
	    {
	    	return(d);
	    }
	}
	public static int Select(int G)
	{
		return(G);
	}
	public static void main(String[] args)
	{
		String P=DecisionMaking(2022);
		char Q=Word('A');
		int R=Multiple(5);
		int T=Relational(10,6);
		int U=Select(Multiple);
		System.out.println(P); 
		System.out.println(Q); 
		System.out.println(R); 
		System.out.println(T); 
		System.out.println(U); 
	}
}
