package Model;

public class Product {
	
	private int Item_Id;
	private String Item_Name;
	private int Amount;
	private int TotStack_Avail;
	public Product() {
		super();
		
	}
	public Product(int item_Id, String item_Name, int amount, int totStack_Avail) {
		super();
		Item_Id = item_Id;
		Item_Name = item_Name;
		Amount = amount;
		TotStack_Avail = totStack_Avail;
	}
	public int getItem_Id() {
		return Item_Id;
	}
	public void setItem_Id(int item_Id) {
		Item_Id = item_Id;
	}
	public String getItem_Name() {
		return Item_Name;
	}
	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getTotStack_Avail() {
		return TotStack_Avail;
	}
	public void setTotStack_Avail(int totStack_Avail) {
		TotStack_Avail = totStack_Avail;
	}
	@Override
	public String toString() {
		return "Product [Item_Id=" + Item_Id + ", Item_Name=" + Item_Name + ", Amount=" + Amount + ", TotStack_Avail="
				+ TotStack_Avail + "]";
	}
	
}

