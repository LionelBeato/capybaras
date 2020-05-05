package Lesson.Factory;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd,cpu);
        else if("Tablet".equalsIgnoreCase(type)) return new Tablet(ram, hdd, cpu);

        return null;
    }
}
