package OnlineShopping;

public class TestCart {
	

	public static void main(String[] args) {
		Item pen = new Item("ball pen",3,15);
		Item laptop=new Item("HP",1,35000);
		Item mobile=new Item("Vivo",1,20000);
		Item book=new Item("Secert",2,2000);
		Item note=new Item("classmate",4,200);
		Item headphone=new Item("Ptron",1,2000);
		
		ShoppingCart SMart = new ShoppingCart();
		SMart.addItem(mobile);
		SMart.addItem(laptop);
		SMart.addItem(pen);
		SMart.addItem(note);
		SMart.addItem(book);
		SMart.addItem(headphone);
			
		System.out.println(SMart.calculateTotalPrice());
		
		
	}

}
