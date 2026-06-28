/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum27042026;

/**
 *
 * @author Night_kid
 */
public class MainPesawat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // buat objek bertipe array
        Pesawat[] daftarPesawat = new Pesawat[3];
        
        daftarPesawat[0] = new Pesawat("Air Asia", 2015, true, 180);
        daftarPesawat[1] = new Pesawat("Lion Air", 2018, false, 100);
        daftarPesawat[2] = new Pesawat("Merpati", 2010, true, 75);
        
        System.out.println("\t DAFTAR PESAWAT\n");
        
        for(int i = 0; i < daftarPesawat.length; i++) {
            System.out.println("\nData Pesawat ke " + (i+1) + " ==");
            daftarPesawat[i].cetak();
            System.out.println();
        }
    }
    
}
