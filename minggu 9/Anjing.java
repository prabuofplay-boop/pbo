/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum27042026;

/**
 *
 * @author Night_kid
 */
public class Anjing extends Hewan {
    public Anjing(String nama){
        super(nama);
    }
    
   
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama+"\tberkata RARWWWWWW!!!");
    } 
    
}
