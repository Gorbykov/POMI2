package com.gad;

public class Stock implements Comparable{

    private int unitPrice;

    private int quantity;

    public Stock() {
    }

    public Stock(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice(){
        return unitPrice*quantity;
    }

    @Override
    public int compareTo(Object o) {
        return getPrice() - ((Stock) o).getPrice();
    }
}
