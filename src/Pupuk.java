/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivaldz
 */
public class Pupuk{
    
private int berat ;
private  String jenisPupuk;



    public Pupuk(int berat, String jenisPupuk) {
        
        this.berat = berat;
        this.jenisPupuk = jenisPupuk;
    }

    public int getBerat() {
        return berat ;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getJenisPupuk() {
        return jenisPupuk;
    }

    public void setJenisPupuk(String jenisPupuk) {
        this.jenisPupuk = jenisPupuk;
   }

}

 