package CoreJava;

public class Arrays {
	public static void main(String[] args)
	{
		int even[]=new int[11];
		int odd[]=new int[11]; 
		int[] prime= {2,7,5,11,13,19,23,29};
		int i;
		
	    for( i=0;i<10;i++)   //m1
	    {
	    	even[i]=i*2;
	    }
	    System.out.println(even[i]);
	    System.out.println("Odd");
	    int var=1;             //m2
	    for( i=0;i<10;i++)
	    {
	    	even[i]=var;
	    	var=var+2;
	    }
	    System.out.println(odd[i]);
	    System.out.println("prime");
	    for(i=0;i<=7;i++)
	    {
	    	System.out.println(prime[i]);
	    }
	    
	    
}
}
