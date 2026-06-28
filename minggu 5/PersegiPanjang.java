/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum30032026;

/**
 *
 * @author Night_kid
 */
public class PersegiPanjang {
     int panjang; //atribut
    int lebar; //atribut 
    
    //konstruktor
    PersegiPanjang(){
        
    }
    
    PersegiPanjang(int a,int b){
        panjang = a;
        lebar = b;
    }
    
    //method
    int hitungLuas(){
        return (panjang*lebar);
    }
    
    int hitungKeliling(){
        return (2* (panjang+lebar));
    }
    
}
