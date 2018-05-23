package com.example.davidg.fruitstand;

import com.example.davidg.fruitstand.model.Fruit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FruitStandHelperTest {

    @Test
    public void checkIfTotalPriceWithoutDiscountIsCorrect() {
        //Setup
        final FruitStandHelper fruitStandHelper = new FruitStandHelper();
        final List<Fruit> fruits = new ArrayList<Fruit>() {{
            add(new Fruit(Fruit.Type.APPLE));
            add(new Fruit(Fruit.Type.APPLE));
            add(new Fruit(Fruit.Type.APPLE));
            add(new Fruit(Fruit.Type.ORANGE));
            add(new Fruit(Fruit.Type.ORANGE));
            add(new Fruit(Fruit.Type.ORANGE));
        }};

        //Execution
        final double totalCost = fruitStandHelper.getTotalWithoutDiscount(fruits);

        //Verification
        Assert.assertEquals(2.55, totalCost, 0.01);
    }

    @Test
    public void checkIfAppleOfferIsCorrect() {
        //Setup
        final FruitStandHelper fruitStandHelper = new FruitStandHelper();
        final List<Fruit> apples = new ArrayList<Fruit>() {{
            add(new Fruit(Fruit.Type.APPLE));
            add(new Fruit(Fruit.Type.APPLE));
            add(new Fruit(Fruit.Type.APPLE));
        }};

        //Execution
        final double totalCostOfApples = fruitStandHelper.getTotalAfterDiscount(apples);

        //Verification
        Assert.assertEquals(1.2f, totalCostOfApples, 0.01);
    }

    @Test
    public void checkIfOrangeOfferIsCorrect() {
        //Setup
        final FruitStandHelper fruitStandHelper = new FruitStandHelper();
        List<Fruit> oranges = new ArrayList<Fruit>() {{
            add(new Fruit(Fruit.Type.ORANGE));
            add(new Fruit(Fruit.Type.ORANGE));
            add(new Fruit(Fruit.Type.ORANGE));
        }};

        //Execution
        double totalCostOfOranges = fruitStandHelper.getTotalAfterDiscount(oranges);

        //Verification
        Assert.assertEquals(0.5f, totalCostOfOranges, 0.01);
    }

    @Test
    public void checkIfTotalPriceWithOfferIsCorrect() {
        //Setup
        final FruitStandHelper fruitStandHelper = new FruitStandHelper();
        final List<Fruit> fruits = new ArrayList<Fruit>() {{
            add(new Fruit(Fruit.Type.APPLE));
            add(new Fruit(Fruit.Type.APPLE));
            add(new Fruit(Fruit.Type.APPLE));
            add(new Fruit(Fruit.Type.ORANGE));
            add(new Fruit(Fruit.Type.ORANGE));
            add(new Fruit(Fruit.Type.ORANGE));
        }};

        //Execution
        final double totalCostWithOffer = fruitStandHelper.getTotalAfterDiscount(fruits);

        //Verification
        Assert.assertEquals(1.7, totalCostWithOffer, 0.01);
    }

}