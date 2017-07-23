package com.example.stevenmacdonald.shopping;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class BasketTest {

    Basket basket;
    Product product;

    @Before
    public void before(){
        product = new Product(01,"Grapes",2.99,false);
        basket = new Basket();

    }






    @Test
    public void addingItemToCustomerBasket(){
        basket.addItemToBasket(product);
        assertEquals(1,basket.countItemsInBasket());
    }

//    @Test
//    public void testingTheItemIsCorrect(){
//        customer.basket.addItemToBasket(product);
//        assertEquals("grapes",basket.);
//    }



}
