/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum27042026;

/**
 *
 * @author Night_kid
 */
public class MainPesawat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // buat objek pada class Pesawat
        Pesawat p = new Pesawat("Air asia", 2020, true, 130);
        
        System.out.println("Kondisi awal");
        p.cetak();
        
        System.out.println();
        
        System.out.println("Kondisi setelah reset");
        p.reset("Lion Air", 1998, false, 80);
        p.cetak();
        
    }
    
}
