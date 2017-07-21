package com.example.stevenmacdonald.shopping;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class CustomerTest {

    Customer customer;
    Product product;
    Basket basket;

    @Before
    public void before(){
        product = new Product(01,"Grapes",2.99,false);
        basket = new Basket();
        customer = new Customer(1,"bob",true,basket);
    }

    @Test
    public void customerHasName(){
        assertEquals("bob", customer.getName());
    }

    @Test
    public void addingItemToCustomerBasket(){
        customer.basket.addItemToBasket(product);
        assertEquals(1,customer.basket.countItemsInBasket());
    }

    @Test
    public void testingTheItemIsCorrect(){
        customer.basket.addItemToBasket(product);
        assertEquals("Grapes",customer.basket.basketItemByID(01));
    }

}
