/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bpc;

/**
 *
 * @author LENOVO
 */
public class C extends B implements IA, ID{
    //properties
    
    //responsibilities : Annotations
    @Override
    public void showData(){
        System.out.println("The show data from the IA interface is executed");
    }
   @Override
    public void showDataFromD(){
        //some info here
        System.out.println("The value of G defined in IA is " +IA.G);
    }
    //methods here

    
    
}
