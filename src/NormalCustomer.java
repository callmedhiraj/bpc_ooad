/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import ICustomer;

/**
 *
 * @author LENOVO
 */
public class NormalCustomer implements ICustomer {
   @Override
    public void register(){
        //do something
        System.out.println("I am a Normal Customer");
    }
    @Override 
    public void unsubcribe(){
        //do something
              System.out.println("I am  quitting my  membership");
    }
    
}
