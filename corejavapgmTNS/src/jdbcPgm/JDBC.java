package jdbcPgm;
// connecting (eclipse)java application to the postqresql (pg4admin)database using JDBC API
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//demo for jdbc program
// step1 : import packages
public class JDBC { 
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException
{
	// step2: load and register the driver
	
	Class.forName("org.postgresql.Driver");
	System.out.println("step 2 load and driver done");
	
	//step3: establish connection
	
	Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TNS-CG08", "postgres", "Saki@096");
	System.out.println("connection completed");
	
	//step4: create statement
	
	Statement st = conn.createStatement();
	
	// step5 : execute query
	
	String strselect="select sname , sid , bname , bcode , renewdate from librarybooks";
	System.out.println("the sql statement is " + strselect);
	
	//step6:process the result to display
	ResultSet rst = st.executeQuery(strselect);
	System.out.println("the records are:");
	int rowcount=0;
	while(rst.next()) {
		String sname = rst.getString("sname");
		int sid=rst.getInt("sid");
		String bname=rst.getString("bname");
		int bcode = rst.getInt("bcode");
		Date renewdate = rst.getDate("renewdate");
		System.out.printf(sname+" "+sid+" "+bname+" "+bcode+" "+renewdate);
		System.out.println();
		++rowcount;
	}
	}

}
