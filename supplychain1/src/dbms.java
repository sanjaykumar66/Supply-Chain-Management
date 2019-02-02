import java.sql.*;

public class dbms {
	public static void main(String[] args)
	{
		int id=10;
		String name="karhgfhik";
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
	Statement sta=con.createStatement();
	ResultSet rs=sta.executeQuery("insert into ash values('"+id+"','"+name+"')");
	con.close();
}

catch(Exception e){
	System.out.print("error");
}
}
}
