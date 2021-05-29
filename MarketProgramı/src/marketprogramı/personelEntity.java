/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketprogramı;

/**
 *
 * @author gizem
 */
public class personelEntity {
        private int id;
    private String isim;
    private String soyisim;
    private int yas;
    private String dtarihi;
    private String cinsiyet;
    
      public personelEntity(int id,String isim,String soyisim,int yas,String dtarihi,String cinsiyet){
        this.id=id;
        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;
        this.dtarihi=dtarihi;
        this.cinsiyet=cinsiyet;
        
    }
     public personelEntity (){
         
     }
      

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getDtarihi() {
        return dtarihi;
    }

    public void setDtarihi(String dtarihi) {
        this.dtarihi = dtarihi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "\npersonel:" + "id=" + id + ", isim=" + isim + ", soyisim=" + soyisim + ", yas=" + yas + ", dtarihi=" + dtarihi + ", cinsiyet=" + cinsiyet + '}';
    }
    
}
