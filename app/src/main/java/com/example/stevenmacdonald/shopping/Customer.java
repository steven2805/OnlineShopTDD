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
    Basket basket;


    public Customer(int ID, String name,boolean loyalCard, Basket basket){
        this.ID = ID;
        this.name = name;
        this.loyalCard = loyalCard;
        this.basket = basket;

    }

    public String getName() {
        return name;
    }




}
