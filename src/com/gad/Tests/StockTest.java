package com.gad.Tests;

import com.gad.Stock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Random;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StockTest {
    private int n = 3;
    private Stock[] stocks = new Stock[n];
    private int[] prices = new int[n];
    private int[] quantities = new int[n];

    @BeforeAll
    void setup() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            prices[i] = random.nextInt();
            quantities[i] = random.nextInt();
            stocks[i] = new Stock(prices[i],quantities[i]);
        }
    }

    @Test
    void getQuantityStatic() {
        int sum = 0;
        for (int i = 0; i <3 ; i++) {
            sum += quantities[i];
        }
        Assertions.assertEquals(sum,Stock.getQuantityStatic(stocks[0],stocks[1],stocks[2]));
    }

    @Test
    void getPrice() {
        Assertions.assertEquals(prices[0]*quantities[0],stocks[0].getPrice());
    }

    @Test
    void getQuantity() {
        Assertions.assertEquals(quantities[0],stocks[0].getQuantity());
        int sum = 0;
        for (int i = 0; i <3 ; i++) {
            sum += quantities[i];
        }
        Assertions.assertEquals(sum,stocks[0].getQuantity(stocks[1],stocks[2]));
    }
}