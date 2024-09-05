/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bpc.programmingToInterface;

/**
 *
 * @author LENOVO
 */
public class TestPTI {
    public static void main(String[] args) {
        //create a reference variable
        //ClassName ref;
        IA ref;
        //asssign the object of the child class
        ref = new B();
        ref.showData(); //B showData
        
        ref = new C();
        ref.showData();
        
    }
}
