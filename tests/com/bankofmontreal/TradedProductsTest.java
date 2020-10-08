package com.bankofmontreal;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TradedProductsTest {

    @InjectMocks
    TradedProducts tradedProducts = new TradedProducts();
    
    @Mock
    ProductPricingService productPricingService;

    @Mock
    Product product;

    @org.junit.Test
    public void addNewProduct() throws ProductAlreadyRegisteredException {
        HashSet<Product> products_actual = new HashSet<>();
        assertArrayEquals(tradedProducts.products.toArray(), products_actual.toArray());



    }

    @org.junit.Test
    public void trade() {

    }

    @org.junit.Test
    public void totalTradeQuantityForDay() {
    }

    @org.junit.Test
    public void totalValueOfDaysTradedProducts() {
    }
}