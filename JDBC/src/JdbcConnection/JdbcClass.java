package JdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcClass {

	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="Amalajenifer@098";
		String query="select * from employeedetail";
		
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		//rs.next();
		//System.out.println(rs.getString("Emp_Name"));
		String name;
		int id;
		int sal;
		String dep;
		int Credit;
		String lin;
		String lout;
		while(rs.next()) {
			name = rs.getString("Emp_Name");
			id=rs.getInt("Emp_Id");
			sal=rs.getInt("Salary");
			dep=rs.getString("Dept");
			Credit=rs.getInt("Credits");
			lin=rs.getString("Logintime");
			lout=rs.getString("logouttime");
			System.out.println(id+"  "+name+"  "+dep+"  "+sal+"  "+Credit+"  "+lin+"  "+lout);
		}
		st.close();

	}

}
