package by.itstep.ivanvikvik.javalessons.model.entity;

public class Milk extends Product {
    private double volume;
    private double fat;

    public Milk() {
    }

    public Milk(double volume, double fat, double price) {
        super(price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "volume = " + volume +
                ", fat = " + fat +
                ", " + super.toString() + '}';
    }
}
