/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class TestAdapter {
    public static void main(String[] args) {
        //Create the instance of USD
        MoneyExchangeAdapter usd = new MoneyExchangeAdapter();
        usd.setAmount(100);
        usd.setExchangeRate(133);
      System.out.println(usd.convertToNrs());
    }
    
}
