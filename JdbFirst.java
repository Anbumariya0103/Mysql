package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbFirst {

	public static void main(String[] args) {
		String dburl= "jdbc:mysql://localhost:3306/employeedetails";
		String username="root";
		String password="root";
		try {
			Connection connection= DriverManager.getConnection(dburl,username,password);
			Statement state = connection.createStatement();
			String insert = "insert into empldata(empcode,empname,empage,esalary)values (101,'Jenny',25,10000),(102,'Jacky',30,20000), (103,'Joe',20,40000),(104,'John',40,80000),(105,'shameer',25,90000)";
					 state.executeUpdate(insert);
					 
	connection.close();		
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
		
	}

