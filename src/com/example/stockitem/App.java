package com.example.stockitem;

public class App {
    public static void main(String[] args){
        StockItem bob = new StockItem("Baked Beans 415g", 65, 15);

        bob.setPrice(80);
        System.out.println(bob.toString());

        // Make one sale
        bob.doSales();

        // make multiple sales
        bob.doSales((short) 15);

        // Check current value
        System.out.println(bob.toString());
    }
}
