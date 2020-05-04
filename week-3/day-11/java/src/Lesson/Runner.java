package Lesson;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

//        Above everything else there are four major pillars of OOP that you should be aware of
//        they are as followed:

//        * Abstraction
//        code implementation is hidden away or "abstracted"
//        * Encapsulation
//        data and the methods that operate on that data are bundled together and abstracted
//        * Inheritance
//        objects can inherit the properties and behaviors of parent objects
//        * Polymorphism
//        objects can take on many forms 


        Vehicle myVehicle = new Vehicle();

        myVehicle.doThing();
        myVehicle.isDriveable();

        Vehicle myCar = new Car(322,1990,"Toyota","Corolla","red",8000.00);

        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        Generic<Vehicle> vehicleGeneric = new Generic<>();


        System.out.println(vehicleGeneric.returnGeneric(myVehicle));





    }
}
