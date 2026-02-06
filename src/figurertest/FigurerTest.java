/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurertest;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shaot01
 */
public class FigurerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
ArrayList<Form> lista = new ArrayList<>();

    int val = input.nextInt();
    
    while (val != 0) {
        System.out.println("Ange ett val");
        System.out.println("1. Skriv ut listan");
        System.out.println("2. Rektangel");
        System.out.println("3. Triangel");
        System.out.println("4. Cirkel");
        System.out.println("0. Avsluta");
      System.out.println ("Vänligen ane ditt val: ");

        val = input.nextInt();
    }
       
        
     switch (val){
         
         case 1: 
    
         case 2:
        System.out.println("Ange x: ");
         int  x = input.nextInt();
        System.out.println("Ange y: ");
         int  y = input.nextInt();    
        System.out.println("Ange bas: ");
         int bas = input.nextInt();
        System.out.println("Ange höjd: ");
         int hojd = input.nextInt();   
         case 3:
             
         case 0:
         
     }
    }
}

