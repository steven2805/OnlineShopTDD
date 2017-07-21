package com.example.stevenmacdonald.shopping;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class ProductTest {


    Product product, product2;

    @Before
    public void before(){
        product = new Product("Apples",88.99,false);
        product2 = new Product("Grapes", 2.99,true);
    }

    @Test
    public void testingTheNameOfAnItem(){
        assertEquals("Apples", product.getName());
    }

    @Test
    public void testingThePricing(){
        assertEquals(2.99, product2.getValue());
    }

    @Test
    public void testingHas2for1Offer(){
        assertEquals(false, product.isTwoforone());
    }

    @Test
    public void testingCanChangeTheName() {
        product2.setName("Burger");
        assertEquals("Burger",product2.getName());

    }



}
