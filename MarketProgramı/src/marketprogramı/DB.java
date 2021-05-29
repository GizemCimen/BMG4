/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketprogramı;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gizem
 */
public class DB {
     private static DB instance;
    private static Connection con ;

    private DB() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MarketProgrami", "postgres", "1234");
            System.out.println("basarili");

        } catch (ClassNotFoundException ex) {
            System.out.println("Baglanti hatasi " + ex.getMessage());
        }
    }

      public static DB getInstance() {
        try {
            if (instance == null) {
                instance = new DB();
            } else if (instance.getCon().isClosed()) {
                instance = new DB();
            }
            return instance;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static Connection getCon() {

        return con;

    }

    public static void setCon(Connection con) {
        DB.con = con;
    }
}
