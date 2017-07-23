package com.example.stevenmacdonald.shopping;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class BasketTest {

    Basket basket;
    Customer customer;
    Product product, product2, product3;

    @Before
    public void before(){
        product = new Product(01,"Grapes",2.00,false);
        product2 = new Product(02,"Bread",4.00,true);
        product3 = new Product(03,"Soup",2.98,true);
        basket = new Basket();
        basket.addItemToBasket(product);
        basket.addItemToBasket(product2);


    }


    @Test
    public void addingItemToCustomerBasket(){
        assertEquals(2,basket.countItemsInBasket());
    }

    @Test
    public void testingTheItemIsCorrect(){
        assertEquals("Grapes",basket.basketItemByID(01));
    }
    @Test
    public void checkHowManyItemsHave2for1FlagSet(){
        basket.addItemToBasket(product);
        assertEquals(1,basket.has2for1Flag());
    }

    @Test
    public void basketTotalNoDiscounts(){
        assertEquals(6.00,basket.totalWithoutDiscount());
    }

    @Test
    public void applyingDiscountOver20(){
        int counter = 11;
        while(counter > 0){
            basket.addItemToBasket(product);
            counter --;
        }
        assertEquals(22.40, basket.above20checkAndDiscount());
    }

    @Test
    public void applyDiscountIfCustomerCard(){
        customer = new Customer(1,"bob",true,basket);
        assertEquals(5.88,basket.discountIfCustomerCard(customer));
    }

    @Test
    public void temptesting(){
        basket.addItemToBasket(product);
        basket.addItemToBasket(product);
        basket.addItemToBasket(product);
        basket.addItemToBasket(product2);
        basket.addItemToBasket(product2);
        basket.addItemToBasket(product3);
        HashMap result = basket.testing();
        assertEquals(0,result);

    }


}
