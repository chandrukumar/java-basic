package database;
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class dataBaseConnectivity {
	public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

    	 //creating connection with the database 
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
		Statement  sta=(Statement) con.createStatement();
		String sql="";
			sta.execute(sql);
		sta.close();
		con.close();
	}

}
