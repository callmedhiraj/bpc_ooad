/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
public class Singleton {
    private static Singleton instance;
    //private constructor
    private Singleton(){
        //do nothing: 
        //to restrict the creation of object from outside of the clcass using new
    }
    public static Singleton getInstance(){
        //if the instance is not null, then create using new operator
        //otherwise return the instance
        if(instance == null){
            //not instantiated 
            instance = new Singleton();
        }
        
       return instance;
    }
    
}
