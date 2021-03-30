/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author gizem
 */
public class Db {

    /**
     * @param args the command line arguments
     */
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
    
}
