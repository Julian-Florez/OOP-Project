package animals;

public class Bird extends Animal{

    /**
     * @param species
     * @param habitat
     * @param age
     * @param canFly
     */

    private boolean canFly;

    public Bird(String species, String habitat, int age, boolean canFly) {
        super(species, habitat, age);
        this.canFly = canFly;
    }
    
    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String toString() {
        return super.toString() + ", can fly?: " + canFly;
    }

    public void makeNoise() {
        System.out.println("Chirp chirp...");
    }
}
