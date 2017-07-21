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

    @Before
    public void before(){
        product = new Product("Grapes",2.99,false);
        customer = new Customer(1,"bob",true);
    }

    @Test
    public void customerHasName(){
        assertEquals("bob", customer.getName());
    }

    @Test
    public void addingItemToCustomerBasket(){
        customer.addItemToBasket(product);
        assertEquals(1,customer.countItemsInBasket());
    }

}
