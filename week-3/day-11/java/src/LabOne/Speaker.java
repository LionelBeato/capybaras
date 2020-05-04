package LabOne;

public class Speaker {

    private int amountOfSpeakers;
    private String brand;

    public int getAmountOfSpeakers() {
        return amountOfSpeakers;
    }

    public void setAmountOfSpeakers(int amountOfSpeakers) {
        this.amountOfSpeakers = amountOfSpeakers;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Speaker(int amountOfSpeakers, String brand) {
        this.amountOfSpeakers = amountOfSpeakers;
        this.brand = brand;
    }
}
