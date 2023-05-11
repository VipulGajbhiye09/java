import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQLPreparedStatementInsert {
  public static void main(String[] args) {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/db,"root","root");
      PreparedStatement stmt = con.prepareStatement("insert into userinfo values (?,?,?,?,?)");
      stmt.setString(1,"newuser");
      stmt.setString(2,"pass");
      stmt.setString(3,"user4gmail.com");
      stmt.setString(4, "City");
      stmt.setString(5, "25");
      int i = stmt.executeUpdate();
      System.out.println(i + "Records inserted..");
      con.close();
    }
    catch(Exception e){
    System.out.println(e);
    }
  }
}
