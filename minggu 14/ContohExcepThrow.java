/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum080626;
import java.util.Scanner;
/**
 *
 * @author Night_kid
 */
public class ContohExcepThrow extends Exception {

     public static void cekNilai(int nilai)throws Exception{
        if(nilai<0){
            throw new Exception("Nilai tidak bolrh nrgatif");
        }
        else if(nilai>100){
            throw new Exception("Nilai maksimum 100");
        }
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       try{
       System.out.print("Masukkan sebuah angka = ");
       int angka = input.nextInt();
       cekNilai(angka);
    }catch(Exception e){
        System.out.println("gagal : "+e.getMessage());
    }finally{
           System.out.println("Sistem berhasil");
       }
    }
    
}
