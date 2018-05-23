package com.example.davidg.fruitstand;

import com.example.davidg.fruitstand.model.Fruit;

import java.util.List;

/**
 * Created by DavidG on 23/05/2018.
 */

public class FruitStandHelper {
    public double getTotalWithoutDiscount(List<Fruit> fruits){
        double total = 0.0;
        for(Fruit fruit : fruits){
            total += fruit.getType().getPrice();
        }
        return total;
    }

    public double getTotalAfterDiscount(List<Fruit> fruits) {
        double total = 0;
        int appleCounter = 0;
        int orangeCounter = 0;
        for(int i = 0; i < fruits.size(); i++) {
            switch (fruits.get(i).getType()) {
                case APPLE:
                    appleCounter ++;
                    if(appleCounter % Fruit.Type.APPLE.getAmountForDiscount() != 0) {
                        total += Fruit.Type.APPLE.getPrice();
                    }
                    break;
                case ORANGE:
                    orangeCounter++;
                    if(orangeCounter % Fruit.Type.ORANGE.getAmountForDiscount() != 0) {
                        total += Fruit.Type.ORANGE.getPrice();
                    }
                    break;
            }
        }
        return total;
    }
}
