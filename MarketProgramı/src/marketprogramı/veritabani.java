//import java.sql.*;

package marketprogramı;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gizem
 */
public class veritabani {
    
     public static void main(String[] args)  {
      try{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/MarketStok?user=root&password=1234");
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery("select * from kategori");
        while(rs.next()){
            System.out.println(rs.getInt("iD")+" "+rs.getString("Kategori"));
            c.close();
        }
      }
        catch(Exception e){
                System.out.println(e);
                }
    }
    
   
    /*public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }*/
    
}
