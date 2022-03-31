package JFS.ProductProjectUpdationController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import JFS.ProductProjectUpdationModel.Product;


@Component
public class ProductController {
	public List<Product> findAllProduct()throws SQLException,ClassNotFoundException
	   {
		   List<Product> productList=new ArrayList<Product>();
		   String query=("Select * from Products;");
		   ResultSet resultset;
		   
		   try {
			   resultset=JdbcConnection.getResultSet(query);
			   while(resultset.next()) 
				{
			   		//System.out.println(resultset.getString("Item_Code")+" "+resultset.getString("Item_Name")+" "+resultset.getInt("Item_Rate")+" "+resultset.getInt("quantity"));
				   int Item_Id=resultset.getInt("Item_Id");
	               String Item_Name=resultset.getString("Item_Name");
	               int Amount=resultset.getInt("Amount");
	               int TotStack_Avail=resultset.getInt("TotStack_Avail");
	               productList.add(new Product(Item_Id,Item_Name,Amount,TotStack_Avail));
			    }
		   }catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   return productList;
	   }
	   
	   public void save()
	   {
		   String query="insert into Products(Item_Id,Item_Name,Amount,TotStack_Avail)values(?,?,?,?)"; 
		   int rows_inserted=0;
		   try {
			   rows_inserted=JdbcConnection.saveRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   
		  System.out.println("Query ok, "+rows_inserted+" rows_updated");
	   }
	   public void modify()
	   {
		   String query=("update Product set Amount=? where Item_Id=?"); 
		   int rows_updated=0;
		   try {
			   rows_updated=JdbcConnection.modifyRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   
			 System.out.println("Query ok, "+rows_updated+" rows_updated");
		   
	   }
	   public void delete()
	   {
		   String query=("delete from Product where Item_Id=?"); 
		   int rows_deleted=0;
		   try {
			   rows_deleted=JdbcConnection.deleteRecord(query);
		   }
		   catch (ClassNotFoundException | SQLException e )
		   {
			    e.printStackTrace();
		   }
		   
			 System.out.println("Query ok, "+rows_deleted+" rows_deleted");
		   
	   }

}
