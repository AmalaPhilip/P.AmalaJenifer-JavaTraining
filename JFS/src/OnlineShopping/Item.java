package OnlineShopping;

public class Item {
	String Pro_Name;
	double totalPrice;
	int Qty;
	public Item(String Pro_Name,int Qty,double UnitPrice) {
		this.Pro_Name=Pro_Name;
		this.Qty=Qty;
		this.totalPrice=Qty*UnitPrice;
		
		
		
	}
	public String getPro_Name() {
		return Pro_Name;
	}
	public void setPro_Name(String pro_Name) {
		this.Pro_Name = pro_Name;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}

}
