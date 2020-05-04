package Lesson;

public class Vehicle extends Testing implements Driveable, Ridable {

    @Override
    public void doThing() {
        super.doThing();
    }

    @Override
    public String toString() {
        return "Vehicle{}";
    }

    @Override
    public void isDriveable() {
        System.out.println("This object is driveable!");

    }

    @Override
    public void isRidable() {
        System.out.println("This object is rideable!");

    }
}
