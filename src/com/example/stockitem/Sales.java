package com.example.stockitem;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner reader = new Scanner(System.in);

        StockItem product = new StockItem("Eggs (box of 6)", 175, 10);

        System.out.print("How many boxes of eggs do you want? ");

        do {
            if(reader.hasNextShort()) {
                short amount = reader.nextShort();
                product.doSales(amount);
                exit = true; // Quit Loop
            } else {
                System.out.print("Invalid Input. Kindly input valid number");
            }
        } while(!exit);

        System.out.println(product.toString());
    }
}
