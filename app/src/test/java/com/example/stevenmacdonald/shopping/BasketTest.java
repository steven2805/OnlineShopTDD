package com.example.stevenmacdonald.shopping;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class BasketTest {

    Basket basket;
    Product product, product2, product3;

    @Before
    public void before(){
        product = new Product(01,"Grapes",2.99,false);
        product2 = new Product(02,"Bread",4.00,true);
        product3 = new Product(03,"Soup",2.98,true);
        basket = new Basket();

    }


    @Test
    public void addingItemToCustomerBasket(){
        basket.addItemToBasket(product);
        assertEquals(1,basket.countItemsInBasket());
    }

    @Test
    public void testingTheItemIsCorrect(){
        basket.addItemToBasket(product);
        assertEquals("Grapes",basket.basketItemByID(01));
    }
    @Test
    public void checkHowManyItemsHave2for1FlagSet(){
        basket.addItemToBasket(product);
        basket.addItemToBasket(product);
        basket.addItemToBasket(product2);
        assertEquals(1,basket.has2for1Flag());
    }

    @Test
    public void basketTotalNoDiscounts(){
        basket.addItemToBasket(product);
        basket.addItemToBasket(product2);
        assertEquals(4.00,basket.totalWithoutDiscount());
    }

    @Test
    public void applyingDiscountOver20(){
        int counter = 10;
        while(counter > 0){
            basket.addItemToBasket(product);
        }
        assertEquals();
    }



}
