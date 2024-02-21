package com.example.stockitem;

public class StockItem {
    /**
     * Fields of a StockItem - the description, stock level, price in pens and expiration date.
     */
    private String description;
    private int level;
    private double price;
    private Date sellByDate;

    /**
     * @param description
     * @param price       Overloaded constructor.
     *                    It also sets a default property for sell by date field.
     */
    public StockItem(String description, double price) {
        this.description = description;
        this.price = price;
        sellByDate = new Date(20, 02, 23);
    }

    /**
     * @param description
     * @param price
     * @param level       Overloaded constructor.
     *                    It also sets a default property for sell by date field.
     */
    public StockItem(String description, double price, int level) {
        this.description = description;
        this.level = level;
        this.price = price;
        sellByDate = new Date(20, 02, 23);
    }

    /**
     * @param sellByDate Overloaded Constructor
     */
    public StockItem(Date date) {
        sellByDate = date;
    }

    /**
     * @return stock level
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * @return stock price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * @return stock description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param price Set stock price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Set sell by date
     *
     * @param date
     */
    public void setSellByDate(Date date) {
        sellByDate = date;
    }

    /**
     * Method Overload.
     * <p>
     * After delivery is done.
     * Set stock level count by 1.
     */
    public void doDelivery() {
        this.level++;
    }

    /**
     * Method Overload
     * <p>
     * Set stock level by an amount after delivery.
     *
     * @param amount
     */
    public void doDelivery(int amount) {
        this.level += amount;
    }

    /**
     * Method Overload
     * <p>
     * Set stock level by removing 1 after sale.
     */
    public void doSales() {
        if (this.level > 0) {
            this.level--;
        }
    }

    /**
     * Method overload
     *
     * @param amount Set stock level by removing amount after sale.
     */
    public void doSales(short amount) {
        if (!outOfStock(amount)) {
            level -= amount;
        }

    }

    public String toString() {
        return "******* Stock Report **********\nItem: " + description + "\nPrice: " + price + "p\nStock level: " + level + "\n******************************";
    }

    /**
     * @param amount
     * @return true if amount is more than what is in stock
     */
    private boolean outOfStock(short amount) {
        return level - amount < 0;
    }
}
