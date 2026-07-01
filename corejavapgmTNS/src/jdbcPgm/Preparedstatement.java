package jdbcPgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//demo for insert and delete
public class Preparedstatement {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register driver
		
		Class.forName("org.postgresql.Driver");
		System.out.println("load is completed");
		
		//establish connection
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TNS-CG08", "postgres", "Saki@096");
		System.out.println("connection completed");
		
		// create statement
		
		Statement st = conn.createStatement();
		
		
		
		/** inserting data into the db
		//String sqlinsert = "insert into librarybooks values('nidaa', 87 ,106,'linux', '2026-06-17')" ;
		String sqlinsert = "insert into librarybooks values('suzume', 16 ,107,'SQL', '2026-07-12')" ;
		System.out.println("the sql statement is:" + sqlinsert);
		 
		// write the query to update
		int countinserted = st.executeUpdate(sqlinsert);
		System.out.println(countinserted +"record inserted");
  **/
		
		/**
		 * //deleting data from db
		String sqldelete="delete from librarybooks where bcode=107";
		System.out.println("the sqlstatement is "+ sqldelete);
		
		int countdeleted = st.executeUpdate(sqldelete);
		System.out.println(countdeleted+"record deleted");
		
		**/
		
		//Updating data from db
		
		String sqlUpdate="update librarybooks set sname='navya', bname='java' where sid=87";
		System.out.println("the sqlstatement is "+ sqlUpdate);
		
		int countUpdated = st.executeUpdate(sqlUpdate);
		System.out.println(countUpdated+"record updated");
		
	}

}
