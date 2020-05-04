package Lesson;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle();

        myVehicle.doThing();
        myVehicle.isDriveable();

        Vehicle myCar = new Car(322,1990,"Toyota","Corolla","red",8000.00);

        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        Generic<Vehicle> vehicleGeneric = new Generic<>();


        System.out.println(vehicleGeneric.returnGeneric(myVehicle));





    }
}
