package by.itstep.ivanvikvik.javalessons.model.entity;

public class Orange extends Product{
    private int diameter;
    private int vitaminC;

    public Orange() {
    }

    public Orange(int diameter, int vitaminC, double price) {
        super(price);
        this.diameter = diameter;
        this.vitaminC = vitaminC;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "diameter = " + diameter +
                ", vitaminC = " + vitaminC +
                "," + super.toString() + '}';
    }
}
