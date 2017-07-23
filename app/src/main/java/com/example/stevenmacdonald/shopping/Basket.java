package com.example.stevenmacdonald.shopping;

import java.util.ArrayList;

/**
 * Created by stevenmacdonald on 21/07/2017.
 */

public class Basket {


    private ArrayList<Product> basket, twoForOne;



    public Basket() {
        basket = new ArrayList<>();
    }

    public void addItemToBasket(Product product) {
        basket.add(product);
    }

    public int countItemsInBasket() {
        return this.basket.size();
    }

    public String basketItemByID(int identitiy) {
        String productName = null;
        for (Product product : basket) {
            if (product.getBarCode() == identitiy) {
                productName = product.getName();
            }
        }
        return productName;
    }

    public int has2for1Flag() {
        int counter = 0;
        for (Product product : basket) {
            if (product.isTwoforone() == true) {
                counter++;
            } else {}
        }
        return counter;
    }

    public double totalWithoutDiscount(){
        double total = 0.00;
        for(Product product: basket){
            total =+ product.getValue();
        }
        return total;
    }


}




