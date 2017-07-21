package com.example.stevenmacdonald.shopping;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */



public class Customer {

    int ID;
    String name;
    boolean loyalCard;
    private ArrayList<Product> basket;

    public Customer(int ID, String name,boolean loyalCard){
        this.ID = ID;
        this.name = name;
        this.loyalCard = loyalCard;
        basket = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addItemToBasket(Product product){
        basket.add(product);
    }

    public int countItemsInBasket(){
        return this.basket.size();
    }

}
