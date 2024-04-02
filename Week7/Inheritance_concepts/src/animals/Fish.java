package animals;

public class Fish extends Animal{

    /**
     * @param species
     * @param habitat
     * @param age
     * @param hasGills
     */

    private boolean hasGills;

    public Fish(String species, String habitat, int age, boolean hasGills) {
        super(species, habitat, age);
        this.hasGills = hasGills;
    }

    public boolean getHasGills() {
        return hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

    public String toString() {
        return super.toString() + ", has gills?: " + hasGills;
    }

    public void makeNoise() {
        System.out.println("Blub blub...");
    }
    
}
