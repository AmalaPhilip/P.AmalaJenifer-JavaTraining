package Purchase;

import java.util.Scanner;

public class Shop implements Shoping{
    public void brand()
    {
    	int num;
    	String brand;
    	System.out.println("Select Brand:");
    	Scanner sc=new Scanner(System.in);
    	num=sc.nextInt();
    	switch(num) {
    	case 1:
    		brand="Levis";
    		System.out.println(brand);
    		break;
    		
    	case 2:
    		brand="Aurelia";
    		System.out.println(brand);
    		break;
    		
    	case 3:
    		brand="Myken";
    		System.out.println(brand);
    		break;
    	}
    	
    }
    public void color() {
    	int num;
    	String color;
    	System.out.println("Select Color:");
    	Scanner sc=new Scanner(System.in);
    	num=sc.nextInt();
    	switch(num) {
    	case 1:
    		color="Blue";
    		System.out.println(color);
    		break;
    		
    	case 2:
    		color="Black";
    		System.out.println(color);
    		break;
    		
    	case 3:
    		color="Red";
    		System.out.println(color);
    		break;
    	}
	}
	public void size() {
		int num;
    	String size;
    	System.out.println("Select Size:");
    	Scanner sc=new Scanner(System.in);
    	num=sc.nextInt();
    	switch(num) {
    	case 1:
    		size="S";
    		System.out.println(size);
    		break;
    		
    	case 2:
    		size="M";
    		System.out.println(size);
    		break;
    		
    	case 3:
    		size="L";
    		System.out.println(size);
    		break;
    	}
				
	}
	public void payment() {
		int num;
    	String pay;
    	System.out.println("Select Payment:");
    	Scanner sc=new Scanner(System.in);
    	num=sc.nextInt();
    	switch(num) {
    	case 1:
    		pay="Cash";
    		System.out.println(pay);
    		break;
    		
    	case 2:
    		pay="UPI";
    		System.out.println(pay);
    		break;
    		
    	case 3:
    		pay="Card";
    		System.out.println(pay);
    		break;
    	}
		
    	System.out.println("Thank You");
	}
	
	
	

}
