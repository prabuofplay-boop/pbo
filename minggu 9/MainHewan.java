/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum27042026;

/**
 *
 * @author Night_kid
 */
public class MainHewan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        //Pembuatan Objek
        Hewan hewanku=new Hewan("Makhluk Hidup");
        Kucing kucingku=new Kucing("Zikri");
        Anjing anjingku=new Anjing("SIgma");
        
        //mengakses super class
        System.out.println("\nTampilan akses super class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        //mengakses sub calss kucing
        System.out.println("\nTampilkan akses sub class kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
    }
}
    

