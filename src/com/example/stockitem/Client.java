package com.example.stockitem;

public class Client {
    public static void main(String[] args) {
        StockItem product1 = new StockItem("Baked beans 415g", 65, 15);
        StockItem product2 = new StockItem("Eggs (box of 6)", 175, 10);
        StockItem product3 = new StockItem("Bread", 175, 10);

        // Set bread price to 99
        product3.setPrice(99);

        // Do 10 cans of baked beans delivery
        product1.doDelivery(10);

        // Sell 3 boxes of egg. cast to short!
        product2.doSales((short) 3);

        // Show report for Product one - Baked beans
        System.out.println(product1.toString());

        // Show report for Product two - Eggs
        System.out.println(product2.toString());

        // Show report for Product three - Bread
        System.out.println(product3.toString());
    }
}
