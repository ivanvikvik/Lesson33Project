package by.itstep.ivanvikvik.javalessons.model.entity;

public class Product {
    private double price;

    public Product() {
    }

    public Product(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price > 0) {
            this.price = price;
        } else {
            throw new Exception();
        }
    }

    @Override
    public String toString() {
        return "price = " + price;
    }
}
