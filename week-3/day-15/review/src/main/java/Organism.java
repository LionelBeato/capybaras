public class Organism {

    private boolean isAlive;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Organism(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String metabolize(){
        return "I just metabolized!";
    }

}
