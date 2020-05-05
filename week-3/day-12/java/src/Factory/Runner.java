package Factory;

public class Runner {

    public static void main(String[] args) {

        Computer myPC = ComputerFactory.getComputer("PC","8GB","500GB","AMD");
        System.out.println(myPC);

    }
}
