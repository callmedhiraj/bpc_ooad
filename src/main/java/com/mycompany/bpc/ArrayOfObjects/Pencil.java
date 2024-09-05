/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bpc.ArrayOfObjects;

/**
 *
 * @author LENOVO
 */
public class Pencil {
    private int strength; //2B, 2BK, 3B, 3BK
    private Double price;
    private String Brand;

    public Pencil() {
    }

    public Pencil(int strength, Double price, String Brand) {
        this.strength = strength;
        this.price = price;
        this.Brand = Brand;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
 @Override
    public String toString(){
        
        System.out.println("Brand " +Brand);
        System.out.println("Price" +price);
        System.out.println("Strength" +strength);
     return null;
    }
    
}
