package com.example.stevenmacdonald.shopping;

import java.util.ArrayList;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class Basket {


    private ArrayList<Product> basket;



    public Basket(){
        basket = new ArrayList<>();
    }

    public void addItemToBasket(Product product){
        basket.add(product);
    }

    public int countItemsInBasket(){
        return this.basket.size();
    }

//    public String basketItemByID(){
//        for(Product product: basket){
//            if product.
//        }
//    }


}
