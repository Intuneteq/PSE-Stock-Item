package com.example.stockitem;

import java.util.ArrayList;
import java.util.List;

public class StockList {
    private final List<StockItem> warehouse;

    public StockList() {
        warehouse = new ArrayList<>();
    }

    public void addStockItem(StockItem item) {
        warehouse.add(item);
    }

    public int noOfStockItems() {
        return warehouse.size();
    }

    public void removeItem(int position) {
        if (outOfBound(position)) return;

        warehouse.remove(position);
    }

    public void showAllItems() {
        for (StockItem item : warehouse) {
            System.out.println(item);
        }
    }

    public String getAllItems() {
        StringBuilder s = new StringBuilder();
        for (StockItem item : warehouse) {
            s.append(item).append("\n");
        }


        return s.toString();
    }


    public StockItem getItem(int position) {
        if (outOfBound(position)) return null;

        return warehouse.get(position);
    }

    public StockItem getItem(String description) {
        for (StockItem item : warehouse) {
            if (item.getDescription().equals(description)) {
                return item;
            }
        }

        return null;
    }

    public void createNewStockItem(String description, double price, int level) {
        var item = new StockItem(description, price, level);

        addStockItem(item);
    }

    private boolean outOfBound(int position) {
        return position < 0 || position > noOfStockItems();
    }
}
