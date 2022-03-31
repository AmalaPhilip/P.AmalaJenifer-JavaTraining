package Sales;
class Dress extends Shopping {
		  private String bodyStyle;
		  public Dress(String make, String color, char size, String model, String bodyStyle) {
		    super(make, color, size, model);  
		    this.bodyStyle = bodyStyle;       
		  }

		  public void DressDetails() {  
		    printDetails();         
		    System.out.println("Body Style: " + bodyStyle);
		  }
		  
		}

