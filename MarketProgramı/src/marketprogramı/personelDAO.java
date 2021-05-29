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
public class personelDAO {
     Connection conn = DB.getInstance().getCon();
    
    public List<personelEntity> listele(String sorgu){
        List<personelEntity> list =new ArrayList();
        try {
            Statement st= conn.createStatement();
            //ResultSet rs = st.executeQuery("select * from personel");
            ResultSet rs=st.executeQuery(sorgu);
            
            while (rs.next()) {
                personelEntity personel = new personelEntity(rs.getInt("id"),rs.getString("isim"),rs.getString("soyisim"),rs.getInt("yas"),rs.getString("dtarihi"),rs.getString("cinsiyet"));
                list.add(personel);
            }
        } catch (Exception e) {
        }
        return list;
    }

   public void Kaydet(personelEntity personel){
         try {
             Statement st=conn.createStatement();
             st.executeUpdate("insert into personel (id,isim,soyisim,yas,dtarihi,cinsiyet) values ('"+personel.getId()+"','"+personel.getIsim()+"','"+personel.getSoyisim()+"','"+personel.getYas()+"','"+personel.getDtarihi()+"','"+personel.getCinsiyet()+"')");
         } catch (Exception ex) {
             ex.printStackTrace();
         }
    }
}
