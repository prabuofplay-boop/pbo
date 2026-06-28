/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum27042026;

/**
 *
 * @author Night_kid
 */
public class Kendaraan {
    String nama;
    private int tahunProduksi;
    
    public String getNama(){
        return nama;
    }
        
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    
    public void setTahunProduksi(int tahunproduksi){
        this.tahunProduksi = tahunProduksi;
    }
    
    public Kendaraan(){
    
    }
    
    public Kendaraan(String nama, int tahunProduksi){
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void cetak(){
        System.out.println("Nama Kendarran : " + nama);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
    
}
