/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClientFactory {
    public static void main(String[] args) {
        //creating the instance uisng the facctory
        FactoryCustomer instance = new FactoryCustomer();
        PrimiumCustomer i = (PrimiumCustomer)instance.createCustomer("Premium");
        NormalCustomer i2 = (NormalCustomer)instance.createCustomer("Normal");
        
       i2.register();
       i2.unsubcribe();
       i.updateCredit(100);
        System.out.println(i.getCredit());
    }
    
}
