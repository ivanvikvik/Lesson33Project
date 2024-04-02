package by.itstep.ivanvikvik.javalessons.model.entity.container;

import by.itstep.ivanvikvik.javalessons.model.entity.Product;

public interface Container {
    void add(Product product);
    void remove(Product product);
    void remove(int index);
    Product get(int index);
    int size();
}
