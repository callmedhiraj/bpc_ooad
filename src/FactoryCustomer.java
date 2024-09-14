/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class FactoryCustomer {
    ICustomer customer;
    public ICustomer createCustomer(String type){
        if(type == "Premium"){
        customer=  new PrimiumCustomer();
       }else if(type == "Normal"){
           customer = new NormalCustomer();
       }
        
       return customer;
        
    }
    public void display(){
        System.out.println(customer);
    }
    
}
