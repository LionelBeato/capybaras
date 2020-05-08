public class Animal extends Organism {

    private static int count;
    private String name;


    public Animal(String name, boolean isAlive) {
        super(isAlive);
        this.name = name;
        count++;
    }

    // The annotation @Override is allowing this class to change the implementation
//    of the method metabolize()
    @Override
    public String metabolize(){
        return "I am an animal and I need food and water and air to live!";
    }

    public static int getCount() {
        return count;
    }

//    public static void setCount(int count) {
//        Animal.count = count;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
