package com.gad;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock implements Comparable {

    private int unitPrice;

    private int quantity;

    public Stock() {
    }

    public Stock(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public static int getQuantityStatic(Stock... stocks) {
        return Stream.of(stocks).mapToInt(f -> f.quantity).sum();
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return unitPrice * quantity;
    }

    public int getQuantity(Stock... stocks) {
        Stock[] newArray = Stream.concat(Stream.of(this),Stream.of(stocks)).toArray(Stock[]::new);
        return getQuantityStatic(newArray);
    }

    @Override
    public int compareTo(Object o) {
        return getPrice() - ((Stock) o).getPrice();
    }
}
