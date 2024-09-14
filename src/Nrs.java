/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Nrs {
    private double amount;

    public Nrs(double amount) {
        this.amount = amount;
    }

    public Nrs() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    //specific request
    public double convertToNrs(MoneyExchangeAdapter m){
        return m.getAmount()*m.getExchangeRate();
    }
    
}
