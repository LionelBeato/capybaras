package Lesson;

import java.util.Objects;

public class Car extends Vehicle {

//    class variables

    private int VIN;
    private int modelYear;
    private String make;
    private String model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return VIN == car.VIN &&
                modelYear == car.modelYear &&
                Double.compare(car.wholesaleCost, wholesaleCost) == 0 &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN, modelYear, make, model, color, wholesaleCost);
    }

    @Override
    public String toString() {
        return "Car{" +
                "VIN=" + VIN +
                ", modelYear=" + modelYear +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wholesaleCost=" + wholesaleCost +
                '}';
    }

    private String color;

    public Car(int VIN, int modelYear, String make, String model, String color, double wholesaleCost) {
        this.VIN = VIN;
        this.modelYear = modelYear;
        this.make = make;
        this.model = model;
        this.color = color;
        this.wholesaleCost = wholesaleCost;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWholesaleCost() {
        return wholesaleCost;
    }

    public void setWholesaleCost(double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    private double wholesaleCost;






//    class methods


}
