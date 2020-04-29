package Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyValue {
    public static void main(String[] args) {

        Map<String, String> personInfo = new HashMap<String, String>();

        personInfo.put("name", "");
        personInfo.put("age", "");
        personInfo.put("hometown", "");
        personInfo.put("favorite food", "");

        Scanner scn = new Scanner(System.in);

        for (Map.Entry<String, String> entry : personInfo.entrySet()){
            String key = entry.getKey();

            System.out.println("Please enter a value for "+key);
            entry.setValue(scn.nextLine());

            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        String printName = "";
        String printAge = "";
        String printHometown = "";
        String printFood = "";

        for (Map.Entry<String, String> entry : personInfo.entrySet()){
            if (entry.getKey().equalsIgnoreCase("name")) {
                 printName = entry.getValue();
            }
            if (entry.getKey().equalsIgnoreCase("age")) {
                printAge = entry.getValue();
            }
            if (entry.getKey().equalsIgnoreCase("hometown")) {
                printHometown = entry.getValue();
            }
            if (entry.getKey().equalsIgnoreCase("favorite food")) {
                printFood = entry.getValue();
            }
        }

        System.out.printf("This is %s%n" +
                "they are %s-years-old%n" +
                "from %s%n" +
                "and their favorite food is %s%n",
                printName, printAge, printHometown, printFood);

    } // end of method
} // end of class
