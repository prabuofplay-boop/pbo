/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum30032026;

/**
 *
 * @author Night_kid
 */
import java.util.Scanner;
public class MainKelasMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Tugas = ");
        double tg = input.nextDouble();
        System.out.print("uts = ");
        double ut = input.nextDouble();
        System.out.print("Uas = ");
        double ua = input.nextDouble();
        
        KelasMahasiswa pp1 = new KelasMahasiswa(tg,ut,ua);
        System.out.println("NilaiAKhir = "+pp1.hitungNilaiAKhir());
        
        input.close();
    }
    }
    

