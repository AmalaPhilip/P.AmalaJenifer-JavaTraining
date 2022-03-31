package JdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbcmodified {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Amalajenifer@098");
		Statement st=con.createStatement();
		String query1="insert into employeedetail(Emp_Id,Emp_Name,Dept,Salary,Credits) values(?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query1);
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id :");
		int id=scanner.nextInt();
		System.out.println("Enter name:");
		String name=scanner.next();
		System.out.println("Enter dept:");
		String dept=scanner.next();
		System.out.println("Enter salary:");
		String salary=scanner.next();
		System.out.println("Enter Credits:");
		int Credits=scanner.nextInt();
		
		
		pst.setInt(1, id);
		pst.setString(2,name);
		pst.setString(3,dept);
		pst.setString(4,salary);
		pst.setInt(5, Credits);
		
		int rows_affected_pst=pst.executeUpdate();
		System.out.println("Query OK,"+rows_affected_pst+"row_affected");
		int rows_affected=st.executeUpdate("insert into employeedetail(Emp_Id,Emp_Name,Dept,Salary,Credits) values(100,'Shiny','cse',50000,90)");
		System.out.println("Query Ok"+ rows_affected+"row_affected");
		ResultSet rs=st.executeQuery("select * from employeedetail");
		while (rs.next())
		{
			System.out.println(rs.getInt("Emp_Id")+"  "+rs.getString("Emp_Name")+"  "+rs.getString("Dept")+"  "+rs.getString("Salary")+" "+rs.getInt("Credits"));
			
		}
		st.close();
		con.close();

	}

}
