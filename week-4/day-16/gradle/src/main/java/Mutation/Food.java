package Mutation;

public class Food {

    private String name;
    private boolean isCooked;

    public Food(String name, boolean isCooked) {
        this.name = name;
        this.isCooked = isCooked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCooked() {
        return isCooked;
    }

    public void setCooked(boolean cooked) {
        isCooked = cooked;
    }
}
