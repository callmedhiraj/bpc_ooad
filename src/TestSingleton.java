/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
public class TestSingleton {
    public static void main(String[] args) {
        //instantiate the Singleton class
        //ILLEGAL
        //Singleton obj1 = new Singleton();
        Singleton obj1 = Singleton.getInstance();
        
        //Another instance 
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        
        if(obj1 == obj2){
            System.out.println("They are the same objects, nonew objects formed");
        }
    }
}
