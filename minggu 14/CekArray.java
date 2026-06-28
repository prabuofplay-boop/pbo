/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum080626;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Night_kid
 */
public class CekArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka ={10,20,30,40,50};
        try{
        System.out.print("Mau bagi angka index ke berapa = ");
        int index = input.nextInt();
        System.out.println("Angka pada index" + index +"adalah " + angka[index]);
        
        System.out.print("Maau dibagia berapa =  ");
        int pembagi = input.nextInt();
        
        int hasil = angka[index]/pembagi;
        System.out.println("Hasil pebagian = " + hasil);
    }//1. Exception array di luar jangkauan
      catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index array tidak ada, masukkan 0-4");
    }//2. Input tidak sesuai
      catch(InputMismatchException e){
            System.out.println("Pastikan input berupa angka");
    }//3. Pembagian dengan nol
      catch(ArithmeticException e){
            System.out.println("Tidak boleh pembagian dengan 0");
    }finally{
            System.out.println("Proses selesai");
            System.out.println("cara 1 ");
            for(int i=0;i<angka.length;i++)
                System.out.print(" " + angka[i]);
            System.out.println("\n cara 2");
            System.out.println("Proses selesai, isi array adalah = ");
            System.out.println("isi array : " + java.util.Arrays.toString(angka));
            //tampilkan isi array
        }
    }
    
}
