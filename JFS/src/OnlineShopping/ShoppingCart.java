package OnlineShopping;

public class ShoppingCart {
	private Item[] cart;
	private double totalPrice;
	private int storedItems;

	
	public ShoppingCart() {
		cart=new Item[5];
		}
	public ShoppingCart(int cartSize) {
		cart=new Item[cartSize];
	}
	
	public void addItem(Item input) {
		if(storedItems<cart.length) {
			cart[storedItems]=input;
			storedItems++;
		}else {
			System.out.println("Shopping cart is full");
		}
	}
	
	public double calculateTotalPrice() {
		for(int i=0;i<cart.length;i++) {
			totalPrice+=cart[i].getTotalPrice();
		}
	return totalPrice;
	}
	

}
