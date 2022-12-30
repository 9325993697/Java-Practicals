
import java.sql.*; 
public class connection { 

 

static Connection con = null; 
public static Connection connectDB()
{ 
try { 

Class.forName("com.mysql.jdbc.Driver"); 

con = DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/hotelman", 
"root", "1234"); 

return con; 
}

catch (SQLException | ClassNotFoundException e) { 

System.out.println(e); 
return null; 
} 
}
} 
