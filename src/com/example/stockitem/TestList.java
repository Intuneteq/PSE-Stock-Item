package com.example.stockitem;

public class TestList {
    public static void main(String[] args) {
        StockList myWareHouse = new StockList();

        // Add Items
        myWareHouse.createNewStockItem("Baked beans 415g", 65, 15);
        myWareHouse.createNewStockItem("Eggs (box of 6)", 175, 10);
        myWareHouse.createNewStockItem("Bread", 175, 10);

        System.out.println();
        System.out.println("********* Printing using show all items *************");
        myWareHouse.showAllItems();

        // Remove an Item
        myWareHouse.removeItem(1);
        System.out.println();
        System.out.println("********* Printing using get all items *************");
        String allItems = myWareHouse.getAllItems();
        System.out.println(allItems);

        // Get Item by position
        StockItem bakedBeans = myWareHouse.getItem(0);
        System.out.println();
        System.out.println(bakedBeans);

        // Get Item by description
        StockItem bread = myWareHouse.getItem("Bread");
        System.out.println();
        System.out.println(bread);
    }
}
