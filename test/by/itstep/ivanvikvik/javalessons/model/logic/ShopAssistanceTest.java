package by.itstep.ivanvikvik.javalessons.model.logic;

import by.itstep.ivanvikvik.javalessons.model.entity.*;
import by.itstep.ivanvikvik.javalessons.model.entity.container.Basket;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testCalculateTotalPricePositive() {
        // A - arrange
        Product[] products = {new Milk(1000, 3.5, 2.0),
                new Bread("Black", "first", 1.5),
                new Orange(100, 3000, 0.5),
                new Water(2.0)};

        //Basket basket = new Basket(products);

        double expected = 6.0;

        // A - act
        //double actual = ShopAssistance.calculateTotalPrice(basket);

        // A - assert
        //assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalPriceByNull() {
        Basket basket = null;
        double expected = -1;

        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testCalculateTotalPriceByEmptyBasket() {
        Basket basket = new Basket();
        double expected = -1;

        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.0);

    }
}