/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class MoneyExchangeAdapter extends USDollar {
    private double exchangeRate;

    public MoneyExchangeAdapter() {
    }

    public MoneyExchangeAdapter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    @Override
    public double convertToNrs(){
        Nrs n = new Nrs();
        return n.convertToNrs(this);
    }
    
    
}
