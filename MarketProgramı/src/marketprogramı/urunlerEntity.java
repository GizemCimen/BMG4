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
public class urunlerEntity {

    private int id;
    private String urunadi;
    private int alisfiyati;
    private int kdv;
    private int kar;
    private int satisfiyati;
    private int alinanmiktar;
    //private Text resim;

    public urunlerEntity(int id, String urunadi, int alisfiyati, int kdv, int kar, int satisfiyati, int alinanmiktar) {
        this.id = id;
        this.urunadi = urunadi;
        this.alisfiyati = alisfiyati;
        this.kdv = kdv;
        this.kar = kar;
        this.satisfiyati = satisfiyati;
        this.alinanmiktar = alinanmiktar;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return urunadi;
    }

    public void setIsim(String isim) {
        this.urunadi = urunadi;
    }

    public int getAlisfiyati() {
        return alisfiyati;
    }

    public void setAlisfiyati(int alisfiyati) {
        this.alisfiyati = alisfiyati;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }

    public int getKar() {
        return kar;
    }

    public void setKar(int kar) {
        this.kar = kar;
    }

    public int getSatisfiyati() {
        return satisfiyati;
    }

    public void setSatisfiyati(int satisfiyati) {
        this.satisfiyati = satisfiyati;
    }

    public int getAlinanmiktar() {
        return alinanmiktar;
    }

    public void setAlinanmiktar(int alinanmiktar) {
        this.alinanmiktar = alinanmiktar;
    }

    @Override
    public String toString() {
        return "\n" + "id=" + id + ", urunadi=" + urunadi + ", alisfiyati=" + alisfiyati + ", kdv=" + kdv + ", kar=" + kar + ", satisfiyati=" + satisfiyati + ", alinanmiktar=" + alinanmiktar + '}';
    }

}
