package com.bankofmontreal;

public class Stocks extends Product {
    private String exchange;
    private String ticker;

    private ProductPricingService productPricingService;

    public Stocks(String exchange, String ticker) {
        super();
        this.exchange = exchange;
        this.ticker = ticker;
    }
    private double calculateValue(){
        double val = productPricingService.price(this.exchange, this.ticker);
        return val;
    }
    public String getExchange() { return exchange; }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTicker() { return ticker; }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

}
