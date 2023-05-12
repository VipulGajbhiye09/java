import java.sql.Connection; import java.sql.DriverManager;
import java.sql.PreparedStatement; import java.sql.ResultSet;
import java.sql.Statement;
public class SQLPreparedStatementUpdate { public static void main(String[] args) {
  try{ Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/db","root","root");
    PreparedStatement stmt = con.prepareStatement("update userinfo set city=? where username=?"); stmt.setString(1,"Chennai");
    stmt.setString(2,"user2"); int i = stmt.executeUpdate();

    System.out.println(i + "Records updated"); con.close();
  }
  catch(Exception e){ 
    System.out.println(e);
  }
  }
}
