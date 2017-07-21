package com.example.stevenmacdonald.shopping;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class ProductTest {


    Product product;

    @Before
    public void before(){
        product1 = new Product("Apples",88.99,false);
        product2 = new Product("Grapes", 2.99,true);
    }

    @Test
    public void testingTheNameOfAnItem(){
        assertEquals("Apples",Product.getName(product1));
    }

}
