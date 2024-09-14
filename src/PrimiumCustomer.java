/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import ICustomer;

/**
 *
 * @author LENOVO
 */
public class PrimiumCustomer implements ICustomer {
    private double credit;
    @Override
    public void register(){
        //do something
        System.out.println("I am a Primium Customer");
    }
    @Override 
    public void unsubcribe(){
        //do something
              System.out.println("I am  quitting my Primium membership");
    }
    public void updateCredit(double credit){
        this.credit= credit;
    }

    public double getCredit() {
        return credit;
    }
    
    
}
