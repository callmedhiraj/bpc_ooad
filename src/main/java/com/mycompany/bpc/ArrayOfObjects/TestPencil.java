/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bpc.ArrayOfObjects;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TestPencil {
    public static void main(String[] args) {
        //instatntiate
        //single object 
        Pencil p1 = new Pencil(3,24.50,"Tuskar");
        System.out.println(p1);  // objectID
        
        //array of objects
        Pencil p[] = new Pencil[2];
        
        //loop variable
        int i;
        for(i = 0; i<2; i++){
            p[i] = new Pencil();
        }//instantiated now
        Scanner input = new Scanner(System.in);
        for(i = 0; i<2; i++){
            // p[i] = new Pencil();
            System.out.println("Enter the brand");
            p[i].setBrand(input.next());
            input.nextLine();//just a hack
            System.out.println("Enter the price ");
            p[i].setPrice(input.nextDouble());
            System.out.println("Enter the Strength ");
            p[i].setStrength(input.nextInt());
           }
        
       //array list 
       ArrayList<Pencil> al ;
       al = new ArrayList<>();
       al.add(p[0]);
       al.add(p[1]);
       for(Pencil ob: al){
           System.out.println("Brand is " + ob.getBrand());
           
       }
       
       
    }
    
}
