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
        basket = new Basket();
        customer = new Customer(1,"bob",true,basket);
    }

    @Test
    public void customerHasName(){
        assertEquals("bob", customer.getName());
    }


}
