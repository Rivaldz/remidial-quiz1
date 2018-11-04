/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivaldz
 */
public class Hitung {
    Padi ppd ;
    Pupuk ppk;

    public Hitung(Padi ppd, Pupuk ppk) {
        this.ppd = ppd;
        this.ppk = ppk;
    }
    public int hitung (){
      return  ppd.getUmurPadi() * ppk.getBerat();
    }
    public  void tampilan(){
        System.out.println("nama Pupuk : " + ppk.getJenisPupuk());
        System.out.println("Jenis Padi : " + ppd.getJenisPadi());
        System.out.println("Total pupuk yang harus dipakai : " + hitung());
    }
    
}
