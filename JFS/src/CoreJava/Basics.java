package CoreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Basics {

	public static void main1(String[] args) {
		
		int year=2022;
		{
			if(year%4 == 0 && year%100 != 0 || year%400 == 0 )
			{
			System.out.println(year + "is a leap year.");
			}
			else
			{
			System.out.println(year + "is not a leap year.");
			}
		}

	
//public static void main(String[] args) throws SQLException {
//	// TODO Auto-generated method stub
//	String url="jdbc:mysql://localhost:3306/employee";
//	String username="root";
//	String password="Amalajenifer@098";
//	String query="select * from Products";
//	
//	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//	Connection con=DriverManager.getConnection(url,username,password);
//	
//	Statement st=con.createStatement();
//	ResultSet rs=st.executeQuery(query);
//	
//	
//	int id;
//	String name;
//	int amount;
//	int Stack;
//	while(rs.next()) {
//		id=rs.getInt("Item_Id");
//		name = rs.getString("Item_Name");
//		amount=rs.getInt("Amount");
//		Stack=rs.getInt("TotStack_Avail");
//		System.out.println(id+"  "+name+"  "+amount+"  "+Stack);
//	}
//	st.close();
	
}
}
	
	
	
	
	
	