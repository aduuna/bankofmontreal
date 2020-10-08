package com.bankofmontreal;

public class Future {
    private String exchange;
    private String contractCode;
    private int contractMonth;
    private int contractYear;

    private ProductPricingService productPricingService;

    public Future(String exchange, String contractCode, int contractMonth, int contractYear) {
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.contractMonth = contractMonth;
        this.contractYear = contractYear;
    }

    private double calculateValue(){
        double val = productPricingService.price(this.exchange, this.contractCode, this.contractMonth, this.contractYear);
        return val;
    }

    public String getExchange() { return exchange; }

    public String getContractCode() { return contractCode; }

    public int getContractMonth() { return contractMonth; }

    public int getContractYear() { return contractYear; }
}
