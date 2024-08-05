import java.sql.*;

public class conn
{
  
    Connection c;
    Statement s;
    public conn()
    {
        try
        {               
	  Class.forName("oracle.jdbc.driver.OracleDriver");  
   	  c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
 	  s=c.createStatement();
   	 System.out.println("connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
public static void main (String args[])
{
  new conn();
}
}
