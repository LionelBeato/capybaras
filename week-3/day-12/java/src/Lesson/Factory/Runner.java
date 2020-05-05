package Lesson.Factory;

public class Runner {

    public static void main(String[] args) {

        Computer myPC = ComputerFactory.getComputer("PC","8GB","500GB","AMD");
        Computer myTablet = ComputerFactory.getComputer("Tablet", "4GB", "100GB", "MediaTek");


        System.out.println(myPC);
        System.out.println(myTablet);

    }
}
