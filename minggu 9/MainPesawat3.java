/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum27042026;
import java.util.Scanner;

/**
 *
 * @author Night_kid
 */
public class MainPesawat3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int i, jumlah;
        
        // --- BAGIAN INPUT DATA ARRAY ---
        System.out.print("Masukkan banyak pesawat = ");
        jumlah = in.nextInt();
        in.nextLine(); // membersihkan new line
        
        Pesawat[] daftarPesawat = new Pesawat[jumlah];
        
        // input
        for(i = 0; i < jumlah; i++) {
            System.out.println("Input Data Pesawat ke " + (i+1));
            
            System.out.print("Nama pesawat = ");
            String nama = in.nextLine();
            
            System.out.print("Tahun Produksi = ");
            int tahunProduksi = in.nextInt();
            
            System.out.print("Menggunakan mesin? (true/false) = ");
            boolean mesin = in.nextBoolean();
            
            System.out.print("Jumlah maksimum penumpang = ");
            int muatan = in.nextInt();
            in.nextLine(); // membersihkan new line lagi setelah nextInt()
            
            // Menciptakan objek dan menyimpannya di laci array
            daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
        }
        
        // --- BAGIAN MENCETAK DATA & MENCARI MUATAN TERBESAR ---
        System.out.println("\t DAFTAR PESAWAT\n");
        
        // Mencetak pesawat urutan pertama (indeks 0) dan menjadikannya pemegang rekor sementara
        System.out.println("\nData Pesawat ke 1 ==");
        daftarPesawat[0].cetak();
        
        int max = daftarPesawat[0].getMuatan();
        String namamax = daftarPesawat[0].getNama();
        
        // Looping untuk mengecek pesawat sisanya (dimulai dari indeks 1)
        for(i = 1; i < jumlah; i++) {
            System.out.println("\nData Pesawat ke " + (i+1) + " ==");
            daftarPesawat[i].cetak();
            
            // Jika muatan pesawat yang sedang dicek ternyata lebih besar dari rekor 'max'
            if(daftarPesawat[i].getMuatan() > max) {
                max = daftarPesawat[i].getMuatan();    // Update rekor angkanya
                namamax = daftarPesawat[i].getNama();  // Update rekor nama pesawatnya
            }
        }
        
        // (Opsional) Kamu bisa menambahkan perintah cetak hasil pemenangnya di sini
        System.out.println("\n==================================");
        System.out.println("Pesawat dengan muatan terbesar adalah: " + namamax + " (" + max + " penumpang)");
    }
    
}
