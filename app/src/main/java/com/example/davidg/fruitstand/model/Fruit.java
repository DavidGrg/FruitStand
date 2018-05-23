package com.example.davidg.fruitstand.model;

/**
 * Created by DavidG on 23/05/2018.
 */

public class Fruit {


    private Type type;

    public enum Type {
        APPLE( 0.6, 2 ),
        ORANGE( 0.25, 3 );

        double price;
        int amountForDiscount;

        Type(double price, int amountForDiscount) {
            this.price = price;
            this.amountForDiscount = amountForDiscount;
        }

        public double getPrice() {
            return price;
        }

        public int getAmountForDiscount() {
            return amountForDiscount;
        }
    }

    public Fruit(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
