/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketprogramı;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gizem
 */
public class urunlerDAO {
     Connection conn = DB.getInstance().getCon();
    
    public List<urunlerEntity> listele(String sorgu){
        List<urunlerEntity> list =new ArrayList();
        try {
            Statement st= conn.createStatement();
            ResultSet rs = st.executeQuery("select * from urunler");
            
            while (rs.next()) {
                urunlerEntity urunler = new urunlerEntity(rs.getInt("id"),rs.getString("urunadi"),rs.getInt("alisfiyati"),rs.getInt("kdv"),rs.getInt("kar"),rs.getInt("satisfiyati"),rs.getInt("alinanmiktar"));
                list.add(urunler);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
