/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivaldz
 */
public class Pupuk extends Padi{
    
private int berat;
private  String jenisPupuk;

    public Pupuk(int berat, String jenisPupuk, String jenisPadi, int umurPadi) {
        super(jenisPadi, umurPadi);
        this.berat = berat;
        this.jenisPupuk = jenisPupuk;
    }

    public Pupuk(String jenisPadi, int umurPadi) {
        super(jenisPadi, umurPadi);
    }

    
    

    public int getBerat() {
        return berat;
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

    public void hitungPupuk(int berat, int umurPadi){
        System.out.println("hasil tampil " + berat + umurPadi);
    }

}

 