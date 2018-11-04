/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivaldz
 */
import java.util.Scanner;

public class HasilPupuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan berat = (gram)");
        int berat = input.nextInt();
        System.out.println("Masukan jenis pupuk = ");
        String jp = input.next();
        System.out.println("Masukan jenis Padi = ");
        String jP = input.next();
        System.out.println("Masukan umur padi  = ");
        int umur = input.nextInt();
        Pupuk pupuk = new Pupuk(berat,jp, jP, umur);
        pupuk.tampilan();
           
    }
    
}
