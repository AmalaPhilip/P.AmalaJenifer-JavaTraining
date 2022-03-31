package Sales;

public class Shopping {
 		  private String make; 
		  private String color; 
		  private char size;      
		  private String model;   
		  public  Shopping(String make, String color, char size, String model) {
		    this.make = make;
		    this.color = color;
		    this.size= size;  
		    this.model = model; 
		  }
		  public void printDetails() {
			    System.out.println("Manufacturer: " + make);
			    System.out.println("Color: " + color);
			    System.out.println("size: " + size);
			    System.out.println("Model: " + model);
			  }
			  
			}


