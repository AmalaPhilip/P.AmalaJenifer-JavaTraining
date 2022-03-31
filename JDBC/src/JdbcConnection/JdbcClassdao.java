package JdbcConnection;    //insert function

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcClassdao {
	public static PreparedStatement pst;
	
	int id;
	String name;
	String dept;
	String salary;
	int Credit;
		
	public void insert()throws SQLException
	{
		
		Scanner scanner =new Scanner(System.in);
		pst.setInt(1,scanner.nextInt());
		pst.setString(2,scanner.nextLine());
		pst.setString(3,scanner.nextLine());
		pst.setString(4,scanner.nextLine());
		pst.setInt(5,scanner.nextInt());
		
	}
	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amalajenifer@098");
		Statement st=con.createStatement();
		JdbcClassdao daoobj=new JdbcClassdao();
		String query1="insert into employeedetail(Emp_Id,Emp_Name,Dept,Salary,Credits) values(?,?,?,?,?)";
		pst=con.prepareStatement(query1);
		daoobj.insert();
		int rows_affected_pst=pst.executeUpdate();
		System.out.println("Query Ok"+ rows_affected_pst+"row_affected_pst");
		st.close();
		con.close();
		
	}

}
