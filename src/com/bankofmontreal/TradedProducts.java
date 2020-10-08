package com.bankofmontreal;

import java.util.ArrayList;
import java.util.HashSet;

public class TradedProducts implements MontrealTradedProducts {

    public static HashSet<Product> products = new HashSet<>();
    private ArrayList<Trade> trades;

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        boolean added = products.add(product);
        if(!added){
            throw new ProductAlreadyRegisteredException();
        }
    }

    @Override
    public void trade(Product product, int quantity) {

        // If Product not registered?
        if (!products.contains(product)){
            // Not Required to Track
            return;
        }

        Trade trade = new Trade(product, quantity);
        trades.add(trade);
    }

    @Override
    public int totalTradeQuantityForDay() {
        int total = 0;
        for (Trade trade: trades){
            total += trade.getQuantity();
        }
        return total;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        double total = 0.0;
        for(Trade trade: trades){
            total += trade.getProduct().getValue() * trade.getQuantity();
        }
        return total;
    }
}
