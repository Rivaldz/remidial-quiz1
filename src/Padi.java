/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivaldz
 */
public class Padi {
 private String jenisPadi;   
 private int umurPadi;

    public Padi(String jenisPadi, int umurPadi) {
        this.jenisPadi = jenisPadi;
        this.umurPadi = umurPadi;
    }

    public String getJenisPadi() {
        return jenisPadi;
    }

    public void setJenisPadi(String jenisPadi) {
        this.jenisPadi = jenisPadi;
    }

    public int getUmurPadi() {
        return umurPadi;
    }

    public void setUmurPadi(int umurPadi) {
        this.umurPadi = umurPadi;
    }
  
}
