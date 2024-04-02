package by.itstep.ivanvikvik.javalessons.model.logic;

import by.itstep.ivanvikvik.javalessons.model.entity.*;
import by.itstep.ivanvikvik.javalessons.model.entity.container.Basket;

public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket) {
        if (basket == null || basket.getSize() == 0) {
            return -1;
        }

        double total = 0;

        for (Product product : basket) {
            total += product.getPrice();
        }

        return total;
    }
}
